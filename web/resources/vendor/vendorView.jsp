<%-- 
    Document   : venderView
    Created on : May 21, 2014, 3:12:29 PM
    Author     : ryutaromatsuda
--%>
    <div class="wrapper">
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
      <%@page import="vendor.vendorItemServlet, java.util.ArrayList" %>
    <h1>Vendor View</h1>
    <div id="listView" class="message">
      <h3>Vendor Store View </h3>
        <div class="items">
        <h4>Top Items</h4>
        <!-- Here supposed to show items for top -->
        <!-- make a if statement here -->
          <table>
            <tr>
              <td>item ID</td>
              <td>Item name </td>
              <td>Description</td>
              <td>Item Qt</td>
              <td>Price</td>
              <td>image</td>
              <td>Edit</td>
              <td>Remove</td>
            </tr>
            <c:forEach var="top" items="${tops}">
              <tr>
                <td>${top.id} </td>
                <td>${top.title}</td>
                <td>${top.desc}</td>
                <td>${top.qt}</td>
                <td>${top.price}</td>                
                <td>${top.imagePath}</td>
                <td>
                  <form action="../../vendor/vendorEditItemServlet" enctype="multipart/form-data" method="get">
                    <input type="hidden" name="formFor" value="edit" />
                    <input type="hidden" name="item_id" value="${top.id}" />
                    <input class='form_button rounded_corner bold' type="submit" value="Edit" />
                  </form>
                </td>
                <td>
                  <form action="../../vendor/vendorDeleteItemServlet" method="post">
                    <input type="hidden" name="formFor" value="delete" />
                    <input type="hidden" name="item_id" value="${top.id}" />
                    <input class='form_button rounded_corner bold' type="submit" value="Remove" />
                  </form>
                </td>
              </tr>
            </c:forEach>
          </table>
       
        </div>
        <div class="items">
        <h4>Bottom Items</h4>
        <!-- Here supposed to show items for bottom -->
        <!-- make a if statement here -->
          <table>
            <tr>
              <td>item ID</td>
              <td>Item name </td>
              <td>Description</td>
              <td>Item Qt</td>
              <td>Price</td>
              <td>image </td>
              <td>Edit</td>
              <td>Remove</td>
            </tr>
            <c:forEach var="top" items="${bottoms}">
              <tr>
                <td>${top.id} </td>
                <td>${top.title}</td>
                <td>${top.desc}</td>
                <td>${top.qt}</td>
                <td>${top.price}</td>                
                <td>${top.imagePath}</td>
                <td>
                  <form action="../../vendor/vendorEditItemServlet" enctype="multipart/form-data" method="get">
                    <input type="hidden" name="formFor" value="edit" />
                    <input type="hidden" name="item_id" value="${top.id}" />
                    <input class='form_button rounded_corner bold' type="submit" value="Edit" />
                  </form>
                </td>
                <td><form action="../../vendor/vendorDeleteItemServlet" method="post">
                    <input type="hidden" name="formFor" value="delete" />
                    <input type="hidden" name="item_id" value="${top.id}" />
                    <input class='form_button rounded_corner bold' type="submit" value="Remove" />
                  </form></td>
              </tr>
            </c:forEach>
          </table>
        </div>
        <div class="items">
        <h4>Surf Items</h4>
        <!-- Here supposed to show items for surf  -->
        <!-- make a if statement here-->
          <table>
            <tr>
              <td>item ID</td>
              <td>Item name </td>
              <td>Description</td>
              <td>Item Qt</td>
              <td>Price</td>
              <td>image</td>
              <td>Edit</td>
              <td>Remove</td>
            </tr>
            <c:forEach var="top" items="${surfs}">
              <tr>
                <td>${top.id} </td>
                <td>${top.title}</td>
                <td>${top.desc}</td>
                <td>${top.qt}</td>
                <td>${top.price}</td>                
                <td>${top.imagePath}</td>
                <td>
                  <form action="../../vendor/vendorEditItemServlet" enctype="multipart/form-data" method="get">
                    <input type="hidden" name="formFor" value="edit" />
                    <input type="hidden" name="item_id" value="${top.id}" />
                    <input class='form_button rounded_corner bold' type="submit" value="Edit" />
                  </form>
                </td>
                <td><form action="../../vendor/vendorDeleteItemServlet" method="post">
                    <input type="hidden" name="formFor" value="delete" />
                    <input type="hidden" name="item_id" value="${top.id}" />
                    <input class='form_button rounded_corner bold' type="submit" value="Remove" />
                  </form></td>
              </tr>
            </c:forEach>
          </table>
        </div>
      <h3>Orders </h3>
        <div class="items">
          <table>
            <tr>
              <td>Name</td>
              <td>Address</td><!-- user full_adder-->
              <td>item ID</td>
              <td>Item name </td>
              <td>Item Qt</td>
              <td>Remove</td>
            </tr>
          </table>
          </div>
    </div>
    </div>
  </body>
</html>
