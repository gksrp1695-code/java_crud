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

    <!-- 게시글 등록 버튼 -->
    <a href="/board/insert">글쓰기</a>

    <!-- 게시글 목록 테이블 -->
    <table border="1">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>날짜</th>
        </tr>

        <!-- Controller에서 전달받은 list를 반복해서 출력 -->
        <c:forEach var="board" items="${list}">
            <tr>
                <td>${board.board_no}</td>
                <td>
                    <!-- 제목 클릭하면 상세보기로 이동 -->
                    <a href="/board/detail?board_no=${board.board_no}">${board.board_title}</a>
                </td>
                <td>${board.mem_id}</td>
                <td>${board.board_date}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>