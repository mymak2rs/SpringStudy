package com.study.shopping.order;

import com.study.shopping.discount.DiscountPolicy;
import com.study.shopping.discount.FixDiscountPolicy;
import com.study.shopping.member.Member;
import com.study.shopping.member.MemberRepository;
import com.study.shopping.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

  private final MemberRepository memberRepository = new MemoryMemberRepository();
  private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

  @Override
  public Order createOrder(Long memberId, String itemName, int itemPrice) {

    Member member = memberRepository.findById(memberId);
    int discountPrice = discountPolicy.discount(member, itemPrice);
    return new Order(memberId, itemName, itemPrice, discountPrice);
  }
}
