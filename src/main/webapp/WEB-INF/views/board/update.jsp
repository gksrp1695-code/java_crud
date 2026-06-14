<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시글 수정</title>
    <script
        src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
</head>
<body>
    <h2>게시글 수정</h2>

    <form action="/board/update" method="post">
        <!-- board_no는 hidden으로 전달 -->
        <input type="hidden" name="board_no" value="${board.board_no}">

        <table border="1">
            <tr>
                <td>제목</td>
                <td><input type="text" name="board_title" value="${board.board_title}"></td>
            </tr>
            <tr>
                <td>작성자</td>
                <td><input type="text" name="mem_id" value="${board.mem_id}" readonly></td>
            </tr>
            <tr>
                <td>내용</td>
                <td><textarea name="board_content" rows="10" cols="50">${board.board_content}</textarea></td>
            </tr>
        </table>

        <button type="submit">수정완료</button>
        <a href="/board/detail?board_no=${board.board_no}">취소</a>
    </form>
</body>
</html>