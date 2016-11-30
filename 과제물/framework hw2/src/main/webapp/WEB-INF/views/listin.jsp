<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>수강신청 하기</h1>

<form action ="${pageContext.request.contextPath}/addlist" method="get" >
<table border="1">
<input type="hidden" name="year" value="2017">
<input type="hidden" name="semester" value="1">
<tr>
<td>과목코드</td>
<td><input type="text" name="sjcode"/></td>
</tr>

<tr>
<td>과목명</td>
<td><input type="text" name="sjname"/></td>
</tr>

<tr>
<td>구분</td>
<td><input type="text" name="sjtype"/></td>
</tr>

<tr>
<td>학점</td>
<td><input type="number" name="sjweight"/></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="수강신청하기"></td>
</tr>
</table>
</form>
</body>
</html>