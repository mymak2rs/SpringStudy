package com.study.shopping.order;

import com.study.shopping.member.Grade;
import com.study.shopping.member.Member;
import com.study.shopping.member.MemberService;
import com.study.shopping.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

  MemberService memberService = new MemberServiceImpl();
  OrderService orderService = new OrderServiceImpl();

  @Test
  void 주문하기() {
    long memberId = 1L;
    Member member = new Member(memberId, "실험체", Grade.VIP);
    memberService.join(member);
    Order order = orderService.createOrder(memberId, "USB", 24900);
    Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
  }
}
