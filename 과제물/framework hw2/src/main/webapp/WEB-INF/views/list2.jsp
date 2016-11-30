<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:set var="aaa">
		0
		</c:set>
	<c:set var="bbb">
		0
		</c:set>
	<c:set var="c">
		0
		</c:set>
	<c:set var="d">
		0
		</c:set>
	<c:set var="e">
		0
		</c:set>
	<c:set var="f">
		0
		</c:set>
		
	<c:set var="g">
		0
		</c:set>
			<c:set var="h">
		0
		</c:set>
	<c:forEach var="sjlist1" items="${sjlist2}">
		<c:set var="g" value="${g+sjlist1.sjweight}" />
		
		<c:if test="${sjlist1.sjtype=='교필'}">
				<c:set var="a" value="${a+sjlist1.sjweight}" />
		</c:if>
		<c:if test="${sjlist1.sjtype=='핵교A'}">
				<c:set var="b" value="${b+sjlist1.sjweight}" />
		</c:if>
		<c:if test="${sjlist1.sjtype=='핵교B'}">
				<c:set var="c" value="${c+sjlist1.sjweight}" />
		</c:if>
		<c:if test="${sjlist1.sjtype=='전기'}">
				<c:set var="d" value="${d+sjlist1.sjweight}" />
		</c:if>
		<c:if test="${sjlist1.sjtype=='전지'}">
				<c:set var="e" value="${e+sjlist1.sjweight}" />
		</c:if>
		<c:if test="${sjlist1.sjtype=='전선'}">
				<c:set var="f" value="${f+sjlist1.sjweight}" />
		</c:if>
		<c:if test="${sjlist1.sjtype=='일교'}">
				<c:set var="h" value="${h+sjlist1.sjweight}" />
		</c:if>
	</c:forEach>

<h1>이수 구분별 학점내역</h1>
	<table border="1">
		<tr align="center">
			<td width="200px"><b>교필</b></td>
			<td width="200px"><b>핵교A</b></td>
			<td width="200px"><b>핵교B</b></td>
			<td width="200px"><b>전기</b></td>
			<td width="200px"><b>전지</b></td>
			<td width="200px"><b>전선</b></td>
			<td width="200px"><b>일교</b></td>
			<td width="200px"><b>총학점</b></td>
		</tr>
		
		<tr align="center">
			<td><b>${a}</b></td>
			<td><b>${b}</b></td>
			<td><b>${c}</b></td>
			<td><b>${d}</b></td>
			<td><b>${e}</b></td>
			<td><b>${f}</b></td>
			<td><b>${h}</b></td>
			<td><b>${g}</b></td>
		</tr>
	</table>
</body>
</html>