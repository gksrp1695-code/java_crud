package com.crud.service;

import com.crud.dto.MemberDto;
import com.crud.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MemberService - 회원 비즈니스 로직 처리
 * Controller와 Mapper 사이에서 데이터 처리
 */
@Service
public class MemberService {

    // MemberMapper 객체 자동 주입
    @Autowired
    private MemberMapper memberMapper;

    // 회원가입 - MemberDto에 담긴 회원 정보를 DB에 저장
    public void insert(MemberDto dto) {
        memberMapper.insert(dto);
    }

    // 로그인 - 아이디/비밀번호 일치하는 회원 조회
    // 일치하면 MemberDto 반환, 없으면 null 반환
    public MemberDto login(MemberDto dto) {
        return memberMapper.login(dto);
    }
}