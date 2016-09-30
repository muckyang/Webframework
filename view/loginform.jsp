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
<h1>Login Form</h1>
<div class="form">
<form action="/helloMVC3/doLogin" method ="get">
<table cellpadding ="5">
<tr>
<td>ID</td>
<td><input type="text" name="customerId"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="customerPassword"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="press"></td>
</tr>
</table>
</form>
</div>
</body>
</html>