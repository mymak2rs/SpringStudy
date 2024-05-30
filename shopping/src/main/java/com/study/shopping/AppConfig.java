package com.study.shopping;

import com.study.shopping.discount.DiscountPolicy;
import com.study.shopping.discount.RateDiscountPolicy;
import com.study.shopping.member.MemberRepository;
import com.study.shopping.member.MemberService;
import com.study.shopping.member.MemberServiceImpl;
import com.study.shopping.member.MemoryMemberRepository;
import com.study.shopping.order.OrderService;
import com.study.shopping.order.OrderServiceImpl;

public class AppConfig {

  public MemberRepository memberRepository() {
    return new MemoryMemberRepository();
  }

  public DiscountPolicy discountPolicy() {
    return new RateDiscountPolicy();
  }

  public MemberService memberService() {
    return new MemberServiceImpl(memberRepository());
  }

  public OrderService orderService() {
    return new OrderServiceImpl(memberRepository(), discountPolicy());
  }
}
