<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>

<%@page isErrorPage="true"%>

<p>数値を入力してください</p>

<%--exceptionでエラーの表示--%>
<p><%=exception%></p>

<%@include file="../footer.html"%>