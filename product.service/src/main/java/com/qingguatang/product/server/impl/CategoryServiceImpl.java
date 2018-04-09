package com.qingguatang.product.server.impl;

import com.qingguatang.product.api.CategorySearchApi;

import com.qingguatang.product.dao.CategoryDAO;
import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.CategoryExtend;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2018/4/7.
 */
public class CategoryServiceImpl implements CategorySearchApi {
  @Autowired
  private CategoryDAO categoryDAO;

  @Override
  public List<Category> query(CategoryQueryParam categoryQueryParam) {
    if(categoryQueryParam == null){
      categoryQueryParam = new CategoryQueryParam();
    }
    List<CategoryDO> categoryDOList = categoryDAO.query(categoryQueryParam);
    if(categoryDOList ==null){
      categoryDOList = new ArrayList<CategoryDO>();
    }

    Map<String, Category> categoryMap = new LinkedHashMap<>();

    //把List转换为Map对象
    for (CategoryDO categoryDO : categoryDOList) {
        //转换do-modele
        String parsentId = categoryDO.getParentCategoryId();

       // CategoryExtend categorys = new CategoryExtend();

        Category category = new Category();
        category.setId(categoryDO.getId());
        category.setStatus(categoryDO.getStatus());
        category.setMediaId(categoryDO.getMediaId());
        category.setName(categoryDO.getName());

        categoryMap.put(category.getId(),category);
      }
      //把子类目放到父类目的children对象里
      categoryMap.forEach((id,category)->{
        Category parent = null;
        if (categoryMap.containsKey(category.getParentId())) {
          parent = categoryMap.get(category.getParentId());
        }else {
          parent = new Category();
          parent.setId("0");
          categoryMap.put("0",parent);
        }
        category.getCategoryExtend().add(category);
      });

      List<Category> categories = categoryMap.get("0").getCategoryExtend();
      return categories;





  }
}
