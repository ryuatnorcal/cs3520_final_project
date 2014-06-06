<%@include file="../Scripts/header.jsp" %>
  <body>
    <div id="wrapper">
        <h1>Vendor </h1>
        <div class="one_row">
          <h3>Publish Edit Item </h3>
          <%@ page import="vendor.vendorEditItemServlet, java.util.ArrayList"%>
          <form action="../../vendor/vendorEditItemServlet" method="post">
            <c:set var="itm" scope="session" value="${item}" />
            <input type="hidden" name="formFor" value="edit"/>
            <input type="hidden" name="item_id" value="${itm.id}">
          <table id="vendor_add_item" class="padding_LR_ten">
            
            <tr>
              <td>Item </td>
              <td><input size="52" class="border_true" type="text" name="item_title" value="${itm.title}" /></td>              
            </tr>
            <tr>
                <td>Description</td>
                <td><textarea rows="10" cols="50" name="item_desc">${itm.desc}</textarea></td>                
            </tr>
            <tr>
              <td>Price</td>
              <td><input size="52" class="border_true" type="text" name="item_price" value="${itm.price}" /></td>
            </tr>
            <tr>
              <td>Qt.</td>
              <td><input size="52" class="border_true" type="text" name="item_qt" value="${itm.qt}" /></td>
            </tr>
            <tr>
              <td>Category</td>
              <td>
              <select class="border_true black_font" name="item_category">
                <c:if test="${itm.category eq 'top'}">
                <option value="top" selected/>Top
                <option value="bottom" />Bottom
                <option value="surf" />Surf
                </c:if>
                <c:if test="${itm.category eq 'bottom'}">
                <option value="top" />Top
                <option value="bottom" selected/>Bottom
                <option value="surf" />Surf
                </c:if>
                <c:if test="${item.category eq 'surf'}">
                <option value="top" />Top
                <option value="bottom" />Bottom
                <option value="surf" selected/>Surf
                </c:if>
              </select>
              </td>
            </tr>
            <tr>
              <td>Image</td>
              <td><input type="file" name="file"/></td>
            </tr>
            <tr>
              <td><input class='form_button rounded_corner bold' type="submit" value="Submit" /></td>
              <td><input class="form_button rounded_corner bold" type="reset" value="Clear" /></td>
            </tr>
          </table>
            </form>
          <a href="../../index.jsp" title="home" class="form_button">Go Back Home </a>
        </div>
    </div>
  </body>
</html>
