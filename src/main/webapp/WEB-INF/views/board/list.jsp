<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>게시글 목록</title>
    <script
        src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
</head>
<body>
    <h2>게시글 목록</h2>

    <!-- 로그인 상태에 따라 버튼 다르게 표시 -->
    <c:choose>
        <c:when test="${sessionScope.loginUser != null}">
            <!-- 로그인 상태 -->
            ${sessionScope.loginUser.mem_name}님 환영합니다!
            <a href="/board/insert">글쓰기</a>
            <a href="/member/logout">로그아웃</a>
        </c:when>
        <c:otherwise>
            <!-- 비로그인 상태 -->
            <a href="/member/login">로그인</a>
            <a href="/member/join">회원가입</a>
        </c:otherwise>
    </c:choose>

    <!-- 게시글 목록 테이블 -->
    <table border="1">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>날짜</th>
        </tr>

        <c:forEach var="board" items="${list}">
            <tr>
                <td>${board.board_no}</td>
                <td>
                    <a href="/board/detail?board_no=${board.board_no}">${board.board_title}</a>
                </td>
                <td>${board.mem_id}</td>
                <td>${board.board_date}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>