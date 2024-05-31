package com.study.shopping;

import com.study.shopping.discount.DiscountPolicy;
import com.study.shopping.discount.RateDiscountPolicy;
import com.study.shopping.member.MemberRepository;
import com.study.shopping.member.MemberService;
import com.study.shopping.member.MemberServiceImpl;
import com.study.shopping.member.MemoryMemberRepository;
import com.study.shopping.order.OrderService;
import com.study.shopping.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public MemberRepository memberRepository() {
    return new MemoryMemberRepository();
  }

  @Bean
  public DiscountPolicy discountPolicy() {
    return new RateDiscountPolicy();
  }

  @Bean
  public MemberService memberService() {
    return new MemberServiceImpl(memberRepository());
  }

  @Bean
  public OrderService orderService() {
    return new OrderServiceImpl(memberRepository(), discountPolicy());
  }
}
