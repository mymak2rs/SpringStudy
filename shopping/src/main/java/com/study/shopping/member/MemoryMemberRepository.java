package com.study.shopping.member;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * 회원 저장소
 */
@Component
public class MemoryMemberRepository implements MemberRepository {

  private static Map<Long, Member> store = new HashMap<>(); // 모든 member들의 정보 저장을 위함

  @Override
  public void save(Member member) {
    store.put(member.getId(), member); // 저장 구현
  }

  @Override
  public Member findById(Long memberId) {
    return store.get(memberId); // Id로 멤버 찾기 구현
  }
}
