package com.study.shopping.member;

import lombok.Getter;
import lombok.Setter;

/**
 * 전체 Member 엔티티 클래스
 */
@Getter
@Setter
public class Member {

  private Long id; // 회원 고유 ID
  private String name; // 회원 이름
  private Grade grade; // 회원 등급

  // 생성자
  public Member(Long id, String name, Grade grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
  }
}
