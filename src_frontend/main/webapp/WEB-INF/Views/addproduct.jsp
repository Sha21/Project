
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<div class="container">
<c:url value="/admin/addproduct/saveproduct" var="prod"></c:url>
<form:form action="${prod}" method="post" modelAttribute="product" enctype="multipart/form-data">
<form:hidden path="id"/>
<br><br><br>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-4" path="productName">Enter Product Name:</form:label> 
<form:input path="productName" class="form-control" /><br>
<form:errors path="productName" cssStyle="color:red"></form:errors>
</div>
</div>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-4" path="price">Enter Price Value:</form:label> 
<form:input path="price"  class="form-control"/><br>
<form:errors path="price" cssStyle="color:red"></form:errors>
</div>
</div>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-4" path="quantity">Enter Quantity:</form:label> 
<form:input path="quantity" id="quan" class="form-control"/><br>
</div>
</div>
<div class="form-group">
<div class="col-sm-10">
<form:label class="control-label col-sm-4" path="description">Enter Description:</form:label> 
<form:textarea path="description"  id="des" class="form-control"/><br>
<form:errors path="description" cssStyle="color:red"></form:errors>
</div>
</div>
<br><br><br><br>
<div class="form-group">
<div class="col-sm-10">
<label>Select Category</label>
<c:forEach items="${categories}" var="c">
   <form:radiobutton path="category.id" value="${c.id}"/>${c.categoryName}
</c:forEach>
</div>
</div>
<br><br><br><br>
<div class="form-group">
<div class="col-sm-10">
 <label>Upload an image </label> 
  <input type="file" name="image" >
  </div>
  </div>
  <br><br>
  <div class="form-group">
  <div class="col-sm-offset-2 col-sm-4">
  <input type="submit"value="addproduct">
  </div>
  </div>
  
  </form:form>
 
 
  </div>
 
</body>
</html>
