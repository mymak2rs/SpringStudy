package com.study.shopping.order;

import com.study.shopping.discount.DiscountPolicy;
import com.study.shopping.member.Member;
import com.study.shopping.member.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

  private final MemberRepository memberRepository;
  private final DiscountPolicy discountPolicy;

  public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
    this.discountPolicy = discountPolicy;
    this.memberRepository = memberRepository;
  }

  @Override
  public Order createOrder(Long memberId, String itemName, int itemPrice) {

    Member member = memberRepository.findById(memberId);
    int discountPrice = discountPolicy.discount(member, itemPrice);
    return new Order(memberId, itemName, itemPrice, discountPrice);
  }
}
