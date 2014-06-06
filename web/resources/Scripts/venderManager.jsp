<%-- 
    Document   : venderManager
    Created on : Apr 29, 2014, 1:47:57 PM
    Author     : ryutaromatsuda

NOTE: show this page only if vender user logged in. 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
   <head>
     <title>Vender Manager</title>
      <%@include file="libs.jsp" %>
    </head>
  <body>
    <div id="wrapper" class="wrapper">
      <div id="cms_wrapper">
        <h3>Items</h3>
        <table>
          <tr>
            <td>ID</td>
            <td>Item</td>
            <td>Remaining Qt.</td>
            <td>Price</td>
            <td>Edit</td>
            <td>Show</td>
            <td>Delete</td>
          </tr>
          <!-- table will automatically generate by Java -->
        </table>
        <h3>Users</h3>
        <table>
          <tr>
            <td>ID</td>
            <td>Username</td>
            <td>Address 1</td>
            <td>Address 2</td>
            <td>City</td>
            <td>Phone</td>
            <td>ZIP</td>
            <td>Show</td>
            <td>Edit</td>
            <td>Delete</td>
          </tr>
          <!-- table will automatically generate by JAVA -->
        </table>
    <h1>Vender Manager </h1>
      </div>
<%@include file="footer.jsp"%>
  </body>
</html>
