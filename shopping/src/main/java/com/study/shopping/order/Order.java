package com.study.shopping.order;

public class Order {

  private Long memberId; // 주문자 id
  private String itemName; // 상품 이름
  private int itemPrice; // 상품 가격
  private int discountPrice; // 할인 가격

  public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
    this.memberId = memberId;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.discountPrice = discountPrice;
  }

  public int calculatePrice() {
    return itemPrice - discountPrice;
  }

  @Override
  public String toString() {
    return "Order{" +
        "memberId=" + memberId +
        ", itemName='" + itemName + '\'' +
        ", itemPrice=" + itemPrice +
        ", discountPrice=" + discountPrice +
        '}';
  }

  public Long getMemberId() {
    return memberId;
  }

  public String getItemName() {
    return itemName;
  }

  public int getItemPrice() {
    return itemPrice;
  }

  public int getDiscountPrice() {
    return discountPrice;
  }
}
