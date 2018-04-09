package com.qingguatang.product.api;

import com.qingguatang.product.model.Category;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.List;

/**
 * Created by Administrator on 2018/4/7.
 */
public interface CategorySearchApi
{
  public List<Category> query(CategoryQueryParam categoryQueryParam);
}
