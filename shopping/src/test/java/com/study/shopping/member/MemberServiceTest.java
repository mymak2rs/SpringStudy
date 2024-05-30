package com.study.shopping.member;

import com.study.shopping.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

  AppConfig appConfig = new AppConfig();
  MemberService memberService = appConfig.memberService();

  @Test
  void 회원가입() {
    Member member = new Member(1L, "실험체1", Grade.VIP);
    memberService.join(member);
    Member findMember = memberService.findMember(1L);

    Assertions.assertThat(member).isEqualTo(findMember);
  }
}
