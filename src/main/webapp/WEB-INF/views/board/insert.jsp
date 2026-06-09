<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>글쓰기</title>
    <script
        src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
</head>
<body>
    <h2>글쓰기</h2>

    <!-- POST 방식으로 /board/insert 에 데이터 전송 -->
    <form action="/board/insert" method="post">

        <table border="1">
            <tr>
                <td>제목</td>
                <!-- name이 BoardDto의 변수명과 일치해야 함 -->
                <td><input type="text" name="board_title"></td>
            </tr>
            <tr>
                <td>작성자</td>
                <td><input type="text" name="mem_id"></td>
            </tr>
            <tr>
                <td>내용</td>
                <td><textarea name="board_content" rows="10" cols="50"></textarea></td>
            </tr>
        </table>

        <button type="submit">등록</button>
        <!-- 목록으로 돌아가기 -->
        <a href="/board/list">취소</a>

    </form>
</body>
</html>