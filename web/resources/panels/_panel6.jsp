<%-- 
    Document   : _panel6
    Created on : Apr 29, 2014, 3:12:12 PM
    Author     : ryutaromatsuda
--%>
<!-- Content 6 -->
<div id="panel6" class="panels panel">
 
  
  <div class="sub_wrapper"> 
    <%@page import="StorePackage.storeListItemServlet, java.util.ArrayList" %>
    <h3>Tees</h3>
    <c:forEach var="top" items="${tops}">
      <div id="${top.id}" class="cube rotationRightFive" style="background-image: url('uploads/${top.imagePath}')">
        
      </div>
        <div id="big-${top.id}" class="bigCube hide">
          
          <div class="big_item_wrapper">
            <div id="image-${top.id}" class="productImages"><img src="uploads/${top.imagePath}" /></div>
            <div class="description_wrapper">
              <h3>${top.title}</h3>
              <p>${top.desc}</p>
              <div class="priceTag">$${top.price}</div>
              <div class="remainItem">${top.qt} are available </div>
              <div class="select_qt">
                <form action="StorePackage/UserPurchaseServlet" method="post" >
                <select class="qt">
                  <option class="one">1</option>
                  <option class="two">2</option>
                  <option class="three">3 </option>
                  <option class="four">4 </option>
                </select>
              <input type="hidden" name="item_name" value="${top.title}" />
              <input type="hidden" name="item_id" value="${top.id}" />
              <input type="hidden" name="item_price" value="${top.price}" />
              <input type="hidden" name="item_size" value="midium" />
              <input type="hidden" name="item_desc" value="${top.desc}" />
              <input type="hidden" name="qt" value="1" />
              <input type="hidden" name="cameFrom" value="panel6" />
              <input type="hidden" name="image_path" value="../img/" />
              <input class='form_button rounded_corner bold order' type="submit" value="Add to Cart" />
              </form>
            </div>
        </div>
        </div>
      </div><!-- end of big cube  -->
    </c:forEach>
  </div>
  <div class="goStoreTopsID cur_pointer align_right">Go Back to Store TOP</div>
</div>
  