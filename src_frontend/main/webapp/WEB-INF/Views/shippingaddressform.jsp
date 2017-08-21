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
<br><br><br><br>
<div class="container">
<c:url value="/cart/order/${cartid}" var="url"></c:url>
<form:form action="${url }" modelAttribute="shippingAddress" >
<form:hidden path="id"/>
<div class="boxed" >
<h2><i>Shipping Address</i></h2>
<br>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-3" path="streetname">Enter Streetname</form:label>
<form:input path="streetname"/>
<form:errors path="streetname" cssStyle="color:red"></form:errors>
</div>
</div>
<br>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-3" path="apartmentnumber">Enter apartmentnumber</form:label>
<form:input path="apartmentnumber"/>
<form:errors path="apartmentnumber" cssStyle="color:red"></form:errors>
</div>
</div>
<br>
<div class="form-group">
<div class="col-sm-10">
<form:label  class="control-label col-sm-3" path="city">Enter City</form:label>
<form:input path="city"/>
<form:errors path="city" cssStyle="color:red"></form:errors>
</div>
</div>
<br>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-3" path="state">Enter State</form:label>
<form:input path="state"/>
<form:errors path="state" cssStyle="color:red"></form:errors>
</div>
</div>
<br>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-3" path="country">Enter Country</form:label>
<form:input path="country"/>
<form:errors path="country" cssStyle="color:red"></form:errors>
</div>
</div>
<br>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-3" path="zipcode">Enter Zipcode</form:label>
<form:input path="zipcode"/>
<form:errors path="zipcode" cssStyle="color:red"></form:errors>
</div>
</div>
<br><br>
<div class="form-group">
<div class="col-sm-offset-3 col-sm-4">
<input type="submit" value="Next">
</div>
</div>
</div>
</form:form>
</div>
</body>
</html>