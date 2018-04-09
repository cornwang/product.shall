package com.qingguatang.product.model;

import java.util.Date;
import java.util.List;

/**
 * @author joe
 * @date 2018/3/27
 */
public class Category {

    private String id;

    private String name;

    private String status;

    private String mediaId;

    private String parentId;

    private List<Category> categoryExtend;

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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public List<Category> getCategoryExtend() {
    return categoryExtend;
  }

  public void setCategoryExtend(List<Category> categoryExtend) {
    this.categoryExtend = categoryExtend;
  }

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }
}
