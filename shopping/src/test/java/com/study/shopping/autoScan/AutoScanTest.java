package com.study.shopping.autoScan;

import com.study.shopping.AutoAppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoScanTest {

  AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
      AutoAppConfig.class);

  @Test
  @DisplayName("모든 빈 출력하기")
  void findAllBean() {
    String[] beanDefinitionNames = ac.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      Object bean = ac.getBean(beanDefinitionName);
      System.out.println("name=" + beanDefinitionName + " object=" + bean);
    }
  }
}
