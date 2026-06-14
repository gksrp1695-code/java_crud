package com.crud.dto;

/**
 * BoardDto - 게시글 데이터를 담는 클래스 (Data Transfer Object)
 * DB의 boards 테이블 컬럼과 1:1로 매핑됩니다.
 * MyBatis가 DB 조회 결과를 자동으로 이 객체에 담아줍니다.
 */

//int     // 정수: 1, 2, 100, -5
//double  // 소수: 3.14, 1.5
//boolean // 참/거짓: true, false
//String  // 문자: "안녕", "홍길동"

public class BoardDto {

    // 게시글 번호 (DB의 board_no 컬럼)
    private int board_no;

    // 게시글 제목 (DB의 board_title 컬럼)
    private String board_title;

    // 작성자 아이디 (DB의 mem_id 컬럼)
    private String mem_id;

    // 게시글 내용 (DB의 board_content 컬럼)
    private String board_content;

    // 작성일 (DB의 board_date 컬럼)
    private String board_date;

    // 조회수 (DB의 board_view 컬럼)
    private int board_view;

    // ===================== Getter =====================
    // Getter = private 변수의 값을 외부에서 읽을 때 사용

    public int getBoard_no() { return board_no; }
    public String getBoard_title() { return board_title; }
    public String getMem_id() { return mem_id; }
    public String getBoard_content() { return board_content; }
    public String getBoard_date() { return board_date; }
    public int getBoard_view() { return board_view; }

    // ===================== Setter =====================
    // Setter = private 변수에 값을 외부에서 넣을 때 사용

    public void setBoard_no(int board_no) { this.board_no = board_no; }
    public void setBoard_title(String board_title) { this.board_title = board_title; }
    public void setMem_id(String mem_id) { this.mem_id = mem_id; }
    public void setBoard_content(String board_content) { this.board_content = board_content; }
    public void setBoard_date(String board_date) { this.board_date = board_date; }
    public void setBoard_view(int board_view) { this.board_view = board_view; }
}