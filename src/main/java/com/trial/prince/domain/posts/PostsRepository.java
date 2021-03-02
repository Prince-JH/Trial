package com.trial.prince.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository상속하면 기본적인 CRUD메소드 자동 생성
public interface PostsRepository  extends JpaRepository<Posts, Long> {
}
