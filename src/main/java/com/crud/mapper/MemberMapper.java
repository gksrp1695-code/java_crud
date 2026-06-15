package com.crud.mapper;

import com.crud.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

/**
 * MemberMapper - 회원 DB 접근 인터페이스
 * member.xml의 SQL과 연결됩니다.
 */
@Mapper
public interface MemberMapper {

    // 회원가입 - 회원 정보를 DB에 저장
    void insert(MemberDto dto);

    // 로그인 - 아이디로 회원 정보 조회
    MemberDto login(MemberDto dto);
}