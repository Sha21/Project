
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<br><br><br><br>
<div class="row">
<div class="jumbotron">
  <h1 class="text-center">Thank You!</h1>
  <p class="text-center"><strong>Your Order Placed  Successfully</strong>
  <a href=""> ${pageContext.request.userPrincipal.name }</a>
   </p>
  <hr>
  <p class="text-center">
    <c:url value="/contactus" var="url2"></c:url>
    Having trouble? <a href="${url2 }">Contact us</a>
  </p>
  <p class="text-center">
  <c:url value="/" var="url1"></c:url>
    <a class="btn btn-primary btn-sm" href="${url1 }" role="button">Continue to homepage</a>
  </p>
</div>
</div>
</div>



</body>
</html>