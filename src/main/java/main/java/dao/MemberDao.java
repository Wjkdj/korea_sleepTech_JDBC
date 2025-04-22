package main.java.dao;

// === DAO 패턴 적용 === //
// 1. DAO 패턴 정의
// : Data Access Object
// - DB와의 접근 로직을 하나의 클래스로 '캡슐화'하여 애플리케이션의 다른 부분과
//  , DB 처리 코드를 분리하는 설계 패턴

// 2. DAO 패턴 사용 목적
// 1) DB 처리만 전담하는 DAO 클래스 생성
// 2) DAO 클래스만 수정하면 DB 처리 수정이 가능
//      >> 구조 명확, 유지보수 용이

// 3. 구조 설계
// 1) db - DBConnection.java (DB 연결 전담)
// 2) entity - Member.java (데이터를 담는 객체)
// 3) dao - MemberDao.java (DB 처리 로직 담당)
// 4) manager - MemberManager.java (실행 및 테스트)

// MemberDAO 클래스
// : Member 테이블에 대한 CRUD 작업을 처리

import main.java.db.DBConnection;
import main.java.entity.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {
    // 어이디(id) 값을 기준으로 사용자 정보를 가져오는 메서드
    public Member getMemberById(int id) throws SQLException {
        // +) get + 사용자 정보 + By + 찾고자 하는 컬럼명
        
        // DBConnection을 통해 DB 연결을 가져옴
        Connection conn = DBConnection.getConnection(); // static 메서드: 클래스명으로 호출

        // 실행할 SQL문 작성
        // : id를 조건으로 사용자 정보 조회 (동적 파라미터)
        String sql = "select * from member where id = ?";

        // SQL 쿼리 실행
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // 실행 객체에 파라미터 값 설정
        pstmt.setInt(1, id); // getUserById 메서드의 매개변수를 인자로 전달

        // SQL 쿼리 실행 >> 결과를 ResultSet으로 저장
        ResultSet rs = pstmt.executeQuery();

        Member member = null; // Member 객체 초기화
        if (rs.next()) { // 결과 집합에 다음 행이 있으면 true 반환

            // Member 객체 생성 >> 결과 저장
            member = new Member(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"));
        }

        rs.close();
        pstmt.close();
        conn.close();

        return member;
    }
}
