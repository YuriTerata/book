<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>

<%@page import="bean.Product,java.util.List"%>

<!-- スクリプトレットJavaの処理記述 処理するだけ -->
<%List<Product> list = (List<Product>) request.getAttribute("list");%>

<%for (Product p : list) {%>

<!-- 式 処理+結果の出力 -->
<%=p.getId()%>:<%=p.getName()%>:<%=p.getPrice()%><br>
<%}%>

<%@include file="../footer.html"%>