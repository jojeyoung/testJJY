<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/head.jsp" %>
<div class="container">
	<form action="/join" method="post">
	  <div class="form-group">
	    <input type="text"  name="username" class="form-control" placeholder="Enter username" required="required">
	  </div>
	  <div class="form-group">
	    <input type="password"  name="password" class="form-control" placeholder="Enter password" required="required">
	  </div>
	  <div class="form-group">
	    <input type="email"  name="email" class="form-control" placeholder="Enter email" required="required">
	  </div>
	  <button type="submit" class="btn btn-primary">회원가입</button>
	</form>
</div>

<%@ include file="../layout/foot.jsp" %>
