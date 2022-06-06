<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="UTF-8">

 <!-- 메뉴 목록 -->
  <table id="menu">
    <tr>
        <td><h2><a href="/">헌혈사이트</a></h2></td>
        <td>
          <a href="/Map/List?menu_id=${ menuList[0].menu_id }">
            ${ menuList[0].menu_name }
          </a>
        </td>
        <td>
          <a href="/Request/List?menu_id=${ menuList[1].menu_id }">
            ${ menuList[1].menu_name }
          </a>
        </td>
        <td>
          <a href="/Booking/List?menu_id=${ menuList[2].menu_id }">
            ${ menuList[2].menu_name }
          </a>
        </td>
        <td>
          <a href="/Guide/List?menu_id=${ menuList[3].menu_id }">
            ${ menuList[3].menu_name }
          </a>
        </td>
        <td>
          <a href="/Member/Login">로그인</a>
        </td>
        <td>
          <a href="/Member/Logout">로그아웃</a>
        </td>
    </tr> 
  </table>
