<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>Login Successe!</h2>
	<%-- JSP Expression Language --%>
	<ul>
		<li>Id : ${customer.id}</li>
		<li>Name : ${customer.name}</li>
		<li>Gender : ${customer.gender}</li>
		<li>E-mail : ${customer.email}</li>
	</ul>
<p><a href = "index.jsp">go to main page.</a></p>
</body>
</html>