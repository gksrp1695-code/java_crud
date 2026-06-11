<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>게시글 상세보기</title>
</head>
<body>
    <h2>게시글 상세보기</h2>

    <table border="1">
        <tr>
            <td>번호</td>
            <td>${board.board_no}</td>
        </tr>
        <tr>
            <td>제목</td>
            <td>${board.board_title}</td>
        </tr>
        <tr>
            <td>작성자</td>
            <td>${board.mem_id}</td>
        </tr>
        <tr>
            <td>내용</td>
            <td>${board.board_content}</td>
        </tr>
        <tr>
            <td>날짜</td>
            <td>${board.board_date}</td>
        </tr>
    </table>

    <!-- 수정/삭제/목록 버튼 -->
    <a href="/board/update?board_no=${board.board_no}">수정</a>
    <a href="/board/delete?board_no=${board.board_no}">삭제</a>
    <a href="/board/list">목록</a>
</body>
</html>