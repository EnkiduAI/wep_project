<%@ page contentType = "text/html; charset = UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title> JSP - HelloWorld</title>
</head>
<body>
<form action="controller" method="get">
<input type="text" name="num" value="1">
<input type="submit" value="push">
</form>
<p>result: ${res}</p>
</body>
</html>
