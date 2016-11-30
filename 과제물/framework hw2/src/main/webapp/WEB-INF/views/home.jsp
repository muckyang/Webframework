<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>


<p><a href ="${pageContext.request.contextPath}/list">학기별 이수 학점 조회</a></p>
<p><a href ="${pageContext.request.contextPath}/list2">이수 구분별 학점 내역</a></p>
<p><a href ="${pageContext.request.contextPath}/listin">수강 신청 하기</a></p>
<p><a href ="${pageContext.request.contextPath}/listcheck">수강 신청 조회</a></p>
</body>
</html>
