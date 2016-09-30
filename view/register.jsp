<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<style>
div.form {
text-align : center;
width: 35%;
padding: 10px;
border: 5px solid gray;
margin:20px;
}
</style>

<body>
<div class ="form">


<form action="/helloMVC3/doregister" method ="get">
<table cellpadding ="5">
<tr>
<td colspan="2"><h4>Registration Form</h4></td>
</tr>

<tr>
<td>아이디 </td>
<td> <input type="text" name="customerId"/></td>
</tr>

<tr>
<td>비밀번호 </td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td>이름</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>성별 </td>
<td><input type="radio" name="gender" value="Male">남성
<input type="radio" name="gender" value="Female">여성</td>
</tr>

<tr>
<td>이메일 </td>
<td> <input type="text" name="email"></td>
<tr>

<tr>
<td>  </td>
<td><input type="submit" value="register"></td>
</tr>
</table>
</form>
</div>
</body>
</html>