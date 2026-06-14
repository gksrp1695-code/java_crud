<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
    <script
        src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
</head>
<body>
    <h2>로그인</h2>

    <!-- 로그인 실패시 에러 메시지 출력 -->
    <% if("true".equals(request.getParameter("error"))) { %>
        <p style="color: red;">아이디 또는 비밀번호가 틀렸습니다.</p>
    <% } %>

    <form action="/member/login" method="post">
        <table border="1">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="mem_id"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="mem_pw"></td>
            </tr>
        </table>

        <button type="submit">로그인</button>
        <a href="/member/join">회원가입</a>
    </form>
</body>
</html>