package main.java.manager;

import main.java.dao.MemberDao;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberManager {
    public void run() throws SQLException {
        Scanner sc = new Scanner(System.in);
        MemberDao memberDao = new MemberDao();

        while (true) {
            System.out.println("1. 사용자 단건 조회");
            System.out.println("2. 사용자 전체 조회");
            System.out.println("3. 사용자 추가");
            System.out.println("4. 사용자 정보 수정");
            System.out.println("5. 사용자 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.println("메뉴 선택: ");

            String selectedMenu = sc.nextLine();

            switch (selectedMenu) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("프로그램을 종료합니다");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요");
                    break;

            }
        }
    }
}
