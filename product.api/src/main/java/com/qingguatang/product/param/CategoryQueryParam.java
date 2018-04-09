package com.qingguatang.product.param;

/**
 * Created by Administrator on 2018/3/28.
 */
public class CategoryQueryParam {

  //是否有children
  private Boolean ishaveChild;

  //状态类型
  private String status;

  //排序字段
  private String orderByAttr;

  //排序类型
  private String sortOrder;

  public Boolean getIshaveChild() {
    return ishaveChild;
  }

  public void setIshaveChild(Boolean ishaveChild) {
    this.ishaveChild = ishaveChild;
  }

  public String getOrderByAttr() {
    return orderByAttr;
  }

  public void setOrderByAttr(String orderByAttr) {
    this.orderByAttr = orderByAttr;
  }

  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
