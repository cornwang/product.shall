package com.qingguatang.product.dao;

import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface CategoryDAO {


    //根据条件查
     List <CategoryDO> query(CategoryQueryParam categoryQueryParam);
}