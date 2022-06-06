<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	* { box-sizing: border-box; }
	#category {  float: left; }
</style>
</head>
<body>
  <div id="main">
    <!--  메뉴목록  -->
    <%@ include file="/WEB-INF/include/menu.jsp" %>
    <!--  메뉴제목  -->
    <div id="title">
      <h2>제목</h2>
    </div>
    <!--  카테고리(왼쪽)  -->
    <div id="category">
        카테고리(왼쪽) &nbsp&nbsp
    </div>
     <!-- 내용(오른쪽)  -->
    <div id="content"> 
       내용(오른쪽)
    </div>
  </div>
  
</body>
</html>