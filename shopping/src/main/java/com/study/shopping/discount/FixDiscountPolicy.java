package com.study.shopping.discount;


import com.study.shopping.member.Grade;
import com.study.shopping.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

  private int discountFixAmount = 1000; // 고정 할인 금액

  @Override
  public int discount(Member member, int price) {
    if (member.getGrade() == Grade.VIP) {
      return discountFixAmount;
    } else {
      return 0;
    }
  }
}
