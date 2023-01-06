<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
<ul>
	<!-- 세션이 없으면 -->
	<li><a href='<c:url value="/register"/>'>회원가입</a></li>
	<!-- 세션이 있으면 -->
	<li><a href='<c:url value="/login"/>'>로그인</a></li>
	<li><a href='<c:url value=""/>'>로그아웃</a></li>
	
</ul>
<ul>
	<li><a href='<c:url value="/freeBoard/freeBoardList"/>'>자유게시판</a></li>
	<li><a href='<c:url value="/animalInfo"/>'>동물 소개</a></li>
	<li><a href='<c:url value="/hospitalInfo"/>'>동물 병원 정보</a></li>
	<li><a href='<c:url value="issue"/>'>이슈</a></li>
	<li><a href='<c:url value=""/>'>마이페이지</a></li>

</ul>
<hr>
</header>
    