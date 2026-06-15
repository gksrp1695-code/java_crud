package com.crud.controller;

import com.crud.dto.MemberDto;
import com.crud.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * MemberController - 회원 요청/응답 처리
 * 회원가입, 로그인, 로그아웃 담당
 */
@Controller
@RequestMapping("/member")  // /member로 시작하는 URL 담당
public class MemberController {

    // MemberService 객체 자동 주입
    @Autowired
    private MemberService memberService;

    // 회원가입 페이지 이동 - /member/join GET 요청
    @GetMapping("/join")
    public String joinForm() {
        return "member/join";
    }

    // 회원가입 처리 - /member/join POST 요청
    @PostMapping("/join")
    public String join(MemberDto dto) {
        memberService.insert(dto);
        // 회원가입 후 로그인 페이지로 이동
        return "redirect:/member/login";
    }

    // 로그인 페이지 이동 - /member/login GET 요청
    @GetMapping("/login")
    public String loginForm() {
        return "member/login";
    }

    // 로그인 처리 - /member/login POST 요청
    @PostMapping("/login")
    public String login(MemberDto dto, HttpSession session) {
        // DB에서 아이디/비밀번호 확인
        MemberDto member = memberService.login(dto);

        if (member != null) {
            // 로그인 성공 - 세션에 회원 정보 저장
            session.setAttribute("loginUser", member);
            return "redirect:/board/list";
        } else {
            // 로그인 실패 - 로그인 페이지로 이동
            return "redirect:/member/login?error=true";
        }
    }

    // 로그아웃 처리 - /member/logout GET 요청
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 세션 초기화
        session.invalidate();
        return "redirect:/member/login";
    }
}