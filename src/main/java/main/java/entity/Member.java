package main.java.entity;

// Entity
// : 데이터베이스 테이블과 매팽되는 클래스
// >> 1:1

// +) Lombok
//    : Java Domain 에서 반복적으로 실행되는 getter나 setter, 생성자 관련 코드 등을
//      , 간결하게 만들어주는 라이브러리
//      1) Lombok 플러그인 설치
//      2) Dependency 설정
//          :compileonly 'org.projectlombok:lombok:1.18.38'
//      3) Enable annotation 설정

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {
    private int id;
    private String name;
    private String email;
}

