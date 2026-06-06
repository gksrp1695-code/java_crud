package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    //로그인 페이지
    @RequestMapping("/login")
    public String login(){
        return "member/login";
    }
    //회원가입 페이지
    @RequestMapping("/join")
    public String join(){
        return "member/join";
    }
}
