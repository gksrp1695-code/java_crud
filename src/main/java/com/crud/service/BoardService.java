package com.crud.service;

import com.crud.dto.BoardDto;
import com.crud.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BoardService - 게시글 비즈니스 로직 처리
 * Controller와 Mapper 사이에서 데이터 처리
 * @Service 어노테이션으로 Spring Bean으로 등록
 */
@Service
public class BoardService {

    // @Autowired - BoardMapper 객체 자동 주입 (new 없이 사용 가능)
    @Autowired
    private BoardMapper boardMapper;

    // 게시글 전체 조회 - Mapper의 selectAll() 호출
    public List<BoardDto> selectAll() {
        return boardMapper.selectAll();
    }

    // 게시글 1개 조회 - board_no(게시글 번호)로 특정 게시글 조회
    public BoardDto selectOne(int board_no) {
        return boardMapper.selectOne(board_no);
    }

    // 게시글 등록 - BoardDto에 담긴 데이터를 DB에 저장
    public void insert(BoardDto dto) {
        boardMapper.insert(dto);
    }

    // 게시글 수정 - BoardDto에 담긴 데이터로 DB 업데이트
    public void update(BoardDto dto) {
        boardMapper.update(dto);
    }

    // 게시글 삭제 - board_no(게시글 번호)로 특정 게시글 삭제
    public void delete(int board_no) {
        boardMapper.delete(board_no);
    }
}