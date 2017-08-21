<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
  <%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false" %>-->

<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  Angular Js
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
  JQuery
  <script src="https://code.jquery.com/ajax/jquery-2.2.1.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
   <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">

 -->
  
<title>Insert title here</title>
</head>
<body>


    
    <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
    <ul class="nav navbar-nav">
     
     <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Product<span class="caret"></span></a>
        <ul class="dropdown-menu">
        
       <!--  <li><a href="addproduct">Add Product</a>
        <li><a href="admin/addproduct/viewproduct">View Product</a>-->
        
        <c:url value="/admin/addproduct" var="url3"></c:url>

         <li>
          <c:if test="${pageContext.request.userPrincipal.name!=null }">
			<security:authorize access="hasRole('ROLE_ADMIN')">
			  <a href="${url3 }">Add Product</a>
			  </security:authorize>
			</c:if>
          </li>
          <!--<c:url value="/admin/addproduct/viewproduct" var="url4"></c:url>
          <li>
          <c:if test="${pageContext.request.userPrincipal.name!=null }">
			<security:authorize access="hasRole('ROLE_ADMIN')">
            <a href="${url4 }">View Product</a>
            </security:authorize>
			</c:if>
          
          </li>-->
         
           
        </ul>
      </li>
      </ul>
    
    
    
  <!--<ul class="nav navbar-nav">
     
     <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Category<span class="caret"></span></a>
        <ul class="dropdown-menu">
       <li><a href="/admin/addcategory">Add Category</a>
        <li><a href="admin/addcategory/viewcategory">View Category</a>
        
        <c:url value="/admin/addcategory" var="url5"></c:url>
    
          <li>
          <c:if test="${pageContext.request.userPrincipal.name!=null }">
			<security:authorize access="hasRole('ROLE_ADMIN')">
            <a href="${url5}">Add Category</a>
            </security:authorize>
			</c:if>
            </li>
             <c:url value="/admin/addcategory/viewcategory" var="url6"></c:url>
          <li>
          <c:if test="${pageContext.request.userPrincipal.name!=null }">
			<security:authorize access="hasRole('ROLE_ADMIN')">
          <a href="${url6}">view Category</a>
          </security:authorize>
			</c:if>
          </li>
          
        </ul>
      </li>
      </ul>-->
   
  
</div>
</div>
</nav>
</body>
</html>
 --%>