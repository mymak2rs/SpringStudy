package com.study.shopping.discount;

import com.study.shopping.member.Member;

public interface DiscountPolicy {

  int discount(Member member, int price);
}
