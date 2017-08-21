<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Bootstrap CSS -->
  <style type="text/css">
  form
{
background-color:rgba(45,45,125,0.58);
color:white;
padding:40px;
margin-top:50px;
margin-left:10px;
padding-top:40px;

box-shadow:10px 10px 5px rgba(6,1,1,0.43)

}  
</style>
  </head>
<body>
<br><br><br><br>
${error}
<c:url value="/j_spring_security_check" var="login"></c:url>
<div class="container">
<div class="row">
<div class="col-sm-offset-4 col-sm-6">

<br><br><br>
<form class="form-horizontal" action="${login}" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Username:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="user" placeholder="Enter username" name="j_username">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="j_password">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="checkbox" name="remember"> Remember me</label>
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>

</div>
</div>

    


</body>
</html>



