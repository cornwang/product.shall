package com.qingguatang.product.model;

import java.util.List;

/**
 * Created by Administrator on 2018/4/8.
 */
public class CategoryExtend {
  private String id;
  private String name;
  private String parentId;

  private List<CategoryExtend> children;

  public List<CategoryExtend> getChildren() {
    return children;
  }

  public void setChildren(List<CategoryExtend> children) {
    this.children = children;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }




}
