<%-- 
    Document   : _panel9
    Created on : Apr 29, 2014, 3:12:56 PM
    Author     : ryutaromatsuda
--%>
<!-- Content 9 -->
<div id="panel9" class="panels panel">
  <%@ page import="OnlineStorePackage.Cart, java.util.ArrayList"%>
  <h3>Cart</h3>
  <div class="one_row">
    <table class="align_center padding_LR_ten">
      <c:choose>
        <c:when test="${cart.count > 0}">       
          <tr>
            <td>Item</td>
            
            <td>Price</td>
            <td>Amount</td>
            <td>Remove?</td>
          </tr>
          <c:forEach var="item" items="${cart.items}">
            
          <tr>
            <td>${item.product.title}</td>
            
            <td>$ ${item.product.price}</td>
            <td>${item.product.qt}</td>
            
            <td>
              <form action="<c:url value='/StorePackage/UserPurchaseServlet' />" method="post">
                <input type='hidden' name='item_id' value="${item.product.id}" />
                <input type='hidden' name='item_qt' value='0' />
                <input type="hidden" name="item_name" value="${item.product.title}" />
                <input type="hidden" name="item_price" value="${item.product.price}" />
                <input type="hidden" name="item_size" value="Medium" />
                <input type="hidden" name="item_desc" value="${item.product.description}" />
                <input type="hidden" name="qt" value="0" />
                <input type="hidden" name="cameFrom" value="panel9" />
                <input type="hidden" name="image_path" value="../img/" />
                <input type='submit' value='Remove' class="form_button rounded_corner bold order" />
              </form>
            </td>
          </tr>
          </c:forEach>
          <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>
              <form action="" method="post">
                <input class="form_button rounded_corner bold order" type="submit" value="Check Out!" />
              </from>
            </td>
          </tr>
      </c:when>      
      <c:otherwise>
        <p>You have no item...</p>
      </c:otherwise>
      </c:choose>
    </table>
        <div class="goStoreTopsID cur_pointer align_right">Go Back to Store TOP</div>
    </div>
</div>