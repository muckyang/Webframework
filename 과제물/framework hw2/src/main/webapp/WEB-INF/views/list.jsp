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
	<c:set var="weight20121">
		0
		</c:set>
	<c:set var="weight20122">
		0
		</c:set>
	<c:set var="weight20151">
		0
		</c:set>
	<c:set var="weight20152">
		0
		</c:set>
	<c:set var="weight20161">
		0
		</c:set>
<c:forEach var="sjlist1" items="${sjlist2}">
			<c:if test="${sjlist1.year=='2012'}">
				<c:if test="${sjlist1.semester=='1'}">
					<c:set var="weight20121" value="${weight20121+sjlist1.sjweight}" />
				</c:if>
				<c:if test="${sjlist1.semester=='2'}">
					<c:set var="weight20122" value="${weight20122+sjlist1.sjweight}" />
				</c:if>
			</c:if>
			<c:if test="${sjlist1.year=='2015'}">
				<c:if test="${sjlist1.semester=='1'}">
					<c:set var="weight20151" value="${weight20151+sjlist1.sjweight}" />
				</c:if>
				<c:if test="${sjlist1.semester=='2'}">
					<c:set var="weight20152" value="${weight20152+sjlist1.sjweight}" />
				</c:if>
			</c:if>
			<c:if test="${sjlist1.year=='2016'}">
				<c:if test="${sjlist1.semester=='1'}">
					<c:set var="weight20161" value="${weight20161+sjlist1.sjweight}" />
				</c:if>

			</c:if>

		</c:forEach>
		
	<h1>학기별 이수 학점 조회</h1>
	
	<table border="1">
		<tr align="center">
			<td width="200px"><b>년도</b></td>
			<td width="200px"><b>학기</b></td>
			<td width="200px"><b>이수학점</b></td>
			<td width="200px"><b>상세보기</b></td>
		</tr>

		<tr align="center">
			<td>2012</td>
			<td>1</td>
			<td>${weight20121}</td>
			<td><a href="${pageContext.request.contextPath}/view/2012/1">링크</a></td>
		</tr>

		<tr align="center">
			<td>2012</td>
			<td>2</td>
			<td>${weight20122}</td>
			<td><a href="${pageContext.request.contextPath}/view/2012/2">링크</a></td>
		</tr>

		<tr align="center">
			<td>2015</td>
			<td>1</td>
			<td>${weight20151}</td>
			<td><a href="${pageContext.request.contextPath}/view/2015/1">링크</a></td>
		</tr>

		<tr align="center">
			<td>2015</td>
			<td>2</td>
			<td>${weight20151}</td>
			<td><a href="${pageContext.request.contextPath}/view/2015/2">링크</a></td>
		</tr>

		<tr align="center">
			<td>2016</td>
			<td>1</td>
			<td>${weight20161}</td>
			<td><a href="${pageContext.request.contextPath}/view/2016/1">링크</a></td>
		</tr>
	</table>
</body>
</html>