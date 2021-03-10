package com.trial.prince;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//JPA Auditing 활성화
//@EnableJpaAuditing
//스프링 Bean 읽기와 생성을 자동으로 설정
//이 위치부터 설정을 읽어가기 때문에 프로젝트 최상단에 위치해야함
//내장 WAS
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
