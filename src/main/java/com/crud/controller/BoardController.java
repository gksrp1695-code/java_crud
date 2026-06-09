package com.crud.controller;

import com.crud.dto.BoardDto;
import com.crud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * BoardController - 게시글 요청/응답 처리
 * 브라우저의 요청을 받아서 Service를 호출하고 결과를 JSP에 전달
 */
@Controller
@RequestMapping("/board")  // /board로 시작하는 URL 담당
public class BoardController {

    // @Autowired - BoardService 객체 자동 주입
    @Autowired
    private BoardService boardService;

    // 게시글 목록 조회 - /board/list 로 접속하면 실행
    @GetMapping({"/list", "/list/"})
    public String list(Model model) {
        // Service에서 게시글 전체 목록 가져옴
        List<BoardDto> list = boardService.selectAll();

        // JSP에 list 데이터 전달
        model.addAttribute("list", list);

        // views/board/list.jsp 로 이동
        return "board/list";
    }
    // 글쓰기 페이지 이동 - /board/insert GET 요청
    @GetMapping("/insert")
    public String insertForm() {
        // views/board/insert.jsp 로 이동
        return "board/insert";
    }

    // 글쓰기 처리 - /board/insert POST 요청
    @PostMapping("/insert")
    public String insert(BoardDto dto) {
        // Service에 글쓰기 요청
        boardService.insert(dto);
        // 등록 후 목록 페이지로 이동
        return "redirect:/board/list";
    }
}