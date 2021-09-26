package com.todo.menu;
public class Menu {

    public static void displaymenu()
    {
        System.out.println();
        System.out.println("1. 할 일 추가 ( add )");
        System.out.println("2. 할 일 삭제 ( del )");
        System.out.println("3. 할 일 수정  ( edit )");
        System.out.println("4. 할 일 목록 표시 ( ls )");
        System.out.println("5. 추가된 카테고리 목록 표시 ( ls_cate )");
        System.out.println("6. 오름차순 정렬 ( ls_name_asc )");
        System.out.println("7. 내림차순 정렬 ( ls_name_desc )");
        System.out.println("8. 오래된 생성 날짜순 정렬 ( ls_date )");
        System.out.println("9. 최근 생성 날짜순 정렬 ( ls_date_desc )");
        System.out.println("10. 키워드 검색 ( find <Keyword>)");
        System.out.println("11. 카테고리 키워드 검색 ( find_cate <Keyword>)");
        System.out.println("12. 종료 ( exit )");
    }

    public static void prompt() {
        System.out.print("명령어 입력 > ");
    }
}
