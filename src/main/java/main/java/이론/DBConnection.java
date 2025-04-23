package main.java.이론;

/*
* === JDBC VS JPA VS MyBatis ===
* : Java(Spring Boot) 에서 DB와 연동하기 위한 방법
*
* 1) JDBC (JDBC API 기반)
*   : Java 에서 DB에 접근할 수 있도록 표준으로 제공하는 API
*   : SQL 문을 문자열로 작성
*       >> Connection, PreparedStatement, ResultSet 등의 객체를 통해 직접 DB와 통신
*
*   cf) Spring JDBC
*       >> 기존의 JDBC을 간소화하는 JDBC 추상화 라이브러리 (스프링 제공)
*
* 2) JPA (ORM, Object Relational Mapping 기반)
*   : Java Persistence API
*   : 자바 객체와 DB 테이블 간의 매핑을 지원하는 ORM 기술의 표준
*   : SQL을 직접 작성하지 않고도, 자바 코드만으로 DB 연동 가능
*   - Spring Boot 에서는 주로 Hibernate를 JPA 구현체로 사용
*
*   장점) SQL 작성이 거의 필요 X, '객체 중심의 개발 가능', 유지보수가 쉽고 비즈니스 로직에 집중 가능
*   단점) 성능 튜닝 어려움 (Hibernate 의 동작 이해 필요), 복잡한 코드 작성 시 SQL, QueryDSL 사용 필요
*
* 3) MyBatis (SQL Mapper 기반)
* */

public class DBConnection {

}
