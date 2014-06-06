<%-- 
    Document   : _panel7
    Created on : Apr 29, 2014, 3:12:20 PM
    Author     : ryutaromatsuda
--%>
<!-- Content 7 -->
<div id="panel7" class="panels panel">
  <div class="sub_wrapper">
  <h3>Shorts</h3>
   <%@page import="StorePackage.storeListItemServlet, java.util.ArrayList" %>
    <c:forEach var="bottom" items="${bottoms}">
      <div id="${bottom.id}" class="cube rotationRightFive" style="background-image: url('uploads/${bottom.imagePath}')">
        
      </div>
        <div id="big-${bottom.id}" class="bigCube hide">
          <div class="big_item_wrapper">
            <div id="image-${bottom.id}" class="productImages"><img src="uploads/${bottom.imagePath}" /></div>
            <div class="description_wrapper">
              <h3>${bottom.title}</h3>
              <p>${bottom.desc}</p>
              <div class="priceTag">$${bottom.price}</div>
              <div class="remainItem">${bottom.qt} are available </div>
              <div class="select_qt">
                <form action="StorePackage/UserPurchaseServlet" method="post" >
                <select class="qt">
                  <option class="one">1</option>
                  <option class="two">2</option>
                  <option class="three">3 </option>
                  <option class="four">4 </option>
                </select>
              <input type="hidden" name="item_name" value="${bottom.title}" />
              <input type="hidden" name="item_id" value="${bottom.id}" />
              <input type="hidden" name="item_price" value="${bottom.price}" />
              <input type="hidden" name="item_size" value="midium" />
              <input type="hidden" name="item_desc" value="${bottom.desc}" />
              <input type="hidden" name="qt" value="1" />
              <input type="hidden" name="cameFrom" value="panel7" />
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