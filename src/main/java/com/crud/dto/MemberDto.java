package com.crud.dto;

/**
 * MemberDto - 회원 데이터를 담는 클래스
 * DB의 members 테이블 컬럼과 1:1로 매핑됨.
 */
public class MemberDto {

    // 회원 아이디 (DB의 mem_id 컬럼)
    private String mem_id;

    // 회원 비밀번호 (DB의 mem_pw 컬럼)
    private String mem_pw;

    // 회원 이름 (DB의 mem_name 컬럼)
    private String mem_name;

    // ===================== Getter =====================
    public String getMem_id() { return mem_id; }
    public String getMem_pw() { return mem_pw; }
    public String getMem_name() { return mem_name; }

    // ===================== Setter =====================
    public void setMem_id(String mem_id) { this.mem_id = mem_id; }
    public void setMem_pw(String mem_pw) { this.mem_pw = mem_pw; }
    public void setMem_name(String mem_name) { this.mem_name = mem_name; }
}