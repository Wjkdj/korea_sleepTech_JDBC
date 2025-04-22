package main.java.jdbc;

/*
* ===== JDBC 환결설정 ======
*
* 1. 필요한 준비물
*   1) JDK(JAVA - JDK 17)
*   2) IDE(Intellij, Eclipse 등)
*   3) MySQL(MySQL Server 8.x 이상 권장)
*   4) JDBC 드라이버
*       : mysql-connector-java-x.x.xx.jar
* 
*   +) SQL 스키마, Java 프로젝트
* */

// === JDBC 연결 시 자주 발생하는 오류 & 해결법 === //
// 1. ClassNotFoundException
// : 외부 라이브러리(sql connector)가 프로젝트에 추가되지 않음

// 2. Acceptㅏ denied for user
// : DB 사용자 ID/PW 오타 또는 권한 없음

// 3. Communications link failure
// : MySQL 서버가 실행 중인지 확인

// 4. Unknown database
// : DB 이름 오타 또는 미생성

public class Jdbc02 {
}
