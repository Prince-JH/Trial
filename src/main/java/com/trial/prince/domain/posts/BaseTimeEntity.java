package com.trial.prince.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
//Audit기능: 생성일자, 수정일자, 생성자, 수정자 칼럼 자동 완성
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    //Entity 생성될 때 시간 자동 저장장
   @CreatedDate
    private LocalDateTime createdDate;


   //조회한 Entity 값 변경할 때 시간 자동 저장
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
