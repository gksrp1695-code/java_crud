package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // / 로 접속하면 자동으로 게시판 목록으로 이동
    @RequestMapping("/")
    public String index() {
        return "redirect:/board/list";
    }
}