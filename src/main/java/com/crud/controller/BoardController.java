package com.crud.controller;

import com.crud.dto.BoardDto;
import com.crud.dto.MemberDto;
import com.crud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
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

    // 게시글 목록 조회
    @GetMapping({"/list", "/list/"})
    public String list(Model model) {
        // Service에서 게시글 전체 목록 가져옴
        List<BoardDto> list = boardService.selectAll();

        // JSP에 list 데이터 전달
        model.addAttribute("list", list);

        // views/board/list.jsp 로 이동
        return "board/list";
    }
    // 글쓰기 페이지 이동
    @GetMapping("/insert")
    public String insertForm(HttpSession session) {
        if(session.getAttribute("loginUser") == null){
            return "redirect:/member/login";
        }
        // views/board/insert.jsp 로 이동
        return "board/insert";
    }

    // 글쓰기 처리
    @PostMapping("/insert")
    public String insert(BoardDto dto, HttpSession session) {
        //로그인한 사용자 아이디를 작성자로 설정
        MemberDto loginUser = (MemberDto) session.getAttribute("loginUser");
        dto.setMem_id(loginUser.getMem_name());
        // Service에 글쓰기 요청
        boardService.insert(dto);
        // 등록 후 목록 페이지로 이동
        return "redirect:/board/list";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam("board_no") int board_no, Model model) {
        //조회수 증가
        boardService.updateView(board_no);
        //게시글 조회
        BoardDto board = boardService.selectOne(board_no);
        model.addAttribute("board", board);  // 이게 없었어요!
        return "board/detail";
    }
    // 수정 페이지 이동
    @GetMapping("/update")
    public String updateForm(@RequestParam("board_no") int board_no, Model model, HttpSession session) {
        if(session.getAttribute("loginUser") == null){
            return "redirect:/member/login";
        }
        // 기존 게시글 데이터 가져와서 JSP에 전달
        BoardDto board = boardService.selectOne(board_no);
        model.addAttribute("board", board);
        return "board/update";
    }

    // 수정 처리
    @PostMapping("/update")
    public String update(BoardDto dto) {
        boardService.update(dto);
        // 수정 후 상세보기로 이동
        return "redirect:/board/detail?board_no=" + dto.getBoard_no();
    }
    // 게시글 삭제
    @GetMapping("/delete")
    public String delete(@RequestParam("board_no") int board_no, HttpSession session) {
        if(session.getAttribute("loginUser")  == null){
            return "redirect:/member/login";
        }
        boardService.delete(board_no);
        // 삭제 후 목록으로 이동
        return "redirect:/board/list";
         }
    }