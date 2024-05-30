package com.study.shopping;

import com.study.shopping.member.Grade;
import com.study.shopping.member.Member;
import com.study.shopping.member.MemberService;
import com.study.shopping.member.MemberServiceImpl;
import com.study.shopping.order.Order;
import com.study.shopping.order.OrderService;
import com.study.shopping.order.OrderServiceImpl;

public class OrderApp {

  public static void main(String[] args) {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    long memberId = 1L;

    Member member = new Member(memberId, "테스트유저", Grade.BASIC);
    memberService.join(member);

    Order order = orderService.createOrder(memberId, "USB", 24900);
    System.out.println("order = " + order);
  }
}
