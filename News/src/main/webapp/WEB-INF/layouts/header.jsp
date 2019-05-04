<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="security"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:url value="/tim-kiem"  var="url"/>

  <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="/home">Báo NCT</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          
          <c:forEach items="${category}" var="category"> 
          <li class="nav-item">
            <a class="nav-link" href="/${category.url}">${category.name}</a>
          </li>
         </c:forEach>
         
          
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Other Pages
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
              <a class="dropdown-item" href="#">Liên Hệ</a>
              <a class="dropdown-item" href="#">Sidebar Page</a>
              <a class="dropdown-item" href="#">FAQ</a>
              <a class="dropdown-item" href="#">404</a>
              <a class="dropdown-item" href="#">Pricing Table</a>
            </div>
          </li>
        </ul>
      </div>
    </div>
  </nav>