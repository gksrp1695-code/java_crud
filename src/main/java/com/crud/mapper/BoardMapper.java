package com.crud.mapper;

import com.crud.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    // 게시글 전체 조회
    List<BoardDto> selectAll();

    // 게시글 1개 조회
    BoardDto selectOne(int board_no);

    // 게시글 등록
    void insert(BoardDto dto);

    // 게시글 수정
    void update(BoardDto dto);

    // 게시글 삭제
    void delete(int board_no);

}
