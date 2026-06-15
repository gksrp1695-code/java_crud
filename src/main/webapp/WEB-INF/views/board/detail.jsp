<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>게시글 상세보기</title>
=======
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>게시글 상세보기</title>
    <script
        src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
>>>>>>> origin/main
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
<<<<<<< HEAD
            <td>${board.mem_id}</td>
=======
            <td>${board.mem_name}</td>
>>>>>>> origin/main
        </tr>
        <tr>
            <td>내용</td>
            <td>${board.board_content}</td>
        </tr>
        <tr>
            <td>날짜</td>
            <td>${board.board_date}</td>
        </tr>
<<<<<<< HEAD
    </table>

    <!-- 수정/삭제/목록 버튼 -->
    <a href="/board/update?board_no=${board.board_no}">수정</a>
    <a href="/board/delete?board_no=${board.board_no}">삭제</a>
=======
        <tr>
            <td>조회수</td>
            <td>${board.board_view}</td>
        </tr>
    </table>

    <!-- 로그인한 사용자만 수정/삭제 버튼 표시 -->
    <c:if test="${sessionScope.loginUser != null && sessionScope.loginUser.mem_name == board.mem_name}">
        <a href="/board/update?board_no=${board.board_no}">수정</a>
        <a href="/board/delete?board_no=${board.board_no}">삭제</a>
    </c:if>
>>>>>>> origin/main
    <a href="/board/list">목록</a>
</body>
</html>