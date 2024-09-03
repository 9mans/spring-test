<%--
  Created by IntelliJ IDEA.
  User: rbska
  Date: 2024-09-04
  Time: 오전 6:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/todo/register" method="post">
        <div>
            Title: <input type="text" name="title">
        </div>
        <div>
            dueDate: <input type="date" name="dueDate">
        </div>
        <div>
            wirter: <input type="text" name="writer">
        </div>
        <div>
            finished: <input type="checkbox" name="finished">
        </div>
        <div>
            <button type="submit">register</button>
        </div>
    </form>

</body>
</html>
