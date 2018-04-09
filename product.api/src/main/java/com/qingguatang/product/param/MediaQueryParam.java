package com.qingguatang.product.param;

/**
 * Created by Administrator on 2018/3/28.
 */
public class MediaQueryParam {

  //类型
  private String mediaType;

  //排序字段
  private String orderByAttr;

  //排序类型
  private String sortOrder;


  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
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
}
