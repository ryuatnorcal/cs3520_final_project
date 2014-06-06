 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="UserFormPackage.*, java.util.ArrayList"%>
<!-- Content 1 -->
<div id="panel1" class="panels panel">
  
<video id="bgVideo" autoplay loop poster="resources/images/431411.jpg" muted><!-- video background -->
  <source src="polina.webm" type="video/webm">
  <source src="resources/videos/quiksilver.mp4" type="video/mp4">
</video><!-- video background -->
<div id="userInfo" class="userInfo">
  
  <c:choose>
    <c:when test="${!current_user.login}">
  <span id="signup" class="signupUser authMenu cur_pointer">SignUP</span>
  <span id="login" class="loginUser authMenu cur_pointer">Login</span>
    </c:when>
    <c:otherwise>
  <a id="logout" class="logoutuser authMenu bold cur_pointer" href="UserFormPackage/UsesrFormServlet?sessionExit=true">Log Out</a>
    
  <span id="username" class="username authMenu bold">Welcome Back ${current_user.user} !!</span>
    </c:otherwise>
  </c:choose>
  
</div>
<div id="menu_bar" class="menu level4">
  <div id="title" class="font-AnnieUseYourTelescope menuCellBig rotationRightFive extraBold">Surfers</div> 
  <div id="menuSelectedPanel5" class="shop menuCell cur_pointer level4">contents 4</div>
  <div id="menuSelectedPanel4" class="shop menuCell cur_pointer level4">contents 3</div>
  <div id="menuSelectedPanel3" class="shop menuCell cur_pointer level4">Shop</div>
  <div id="menuSelectedPanel2" class="about menuCell cur_pointer level4">About</div>                    
</div>
</div><!-- end of panel1-->
<div id="signUPForm" class="hide fullScreen level6 forms"><div id="exit" class="exit smallFont cur_pointer">X Close</div><%@include file="../Scripts/userInformationForm.jsp" %></div>
<div id="signInForm" class="hide fullScreen level6 forms"><div id="exit" class="exit smallFont cur_pointer">X Close</div><%@include file="../Scripts/userLogIn.jsp" %></div>