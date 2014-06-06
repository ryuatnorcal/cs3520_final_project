<%-- 
    Document   : _panel8
    Created on : Apr 29, 2014, 3:12:32 PM
    Author     : ryutaromatsuda
--%>
<!-- Content 8 -->
<div id="panel8" class="panels panel">
  
    <div class="sub_wrapper">
  <h3>SurfBoards </h3>
   <%@page import="StorePackage.storeListItemServlet, java.util.ArrayList" %>
    <c:forEach var="surf" items="${surfs}">
      <div id="${surf.id}" class="cube rotationRightFive" style="background-image: url('uploads/${surf.imagePath}')">
       
      </div>
        <div id="big-${surf.id}" class="bigCube hide">
          
          <div class="big_item_wrapper">
            <div id="image-${surf.id}" class="productImages"><img src="uploads/${surf.imagePath}" /></div>
            <div class="description_wrapper">
              <h3>${surf.title}</h3>
              <p>${surf.desc}</p>
              <div class="priceTag">$${surf.price}</div>
              <div class="remainItem">${surf.qt} are available </div>
              <div class="select_qt">
                <form action="StorePackage/UserPurchaseServlet" method="post" >
                <select class="qt">
                  <option class="one">1</option>
                  <option class="two">2</option>
                  <option class="three">3 </option>
                  <option class="four">4 </option>
                </select>
              <input type="hidden" name="item_name" value="${surf.title}" />
              <input type="hidden" name="item_id" value="${surf.id}" />
              <input type="hidden" name="item_price" value="${surf.price}" />
              <input type="hidden" name="item_size" value="midium" />
              <input type="hidden" name="item_desc" value="${surf.desc}" />
              <input type="hidden" name="qt" value="1" />
              <input type="hidden" name="cameFrom" value="panel8" />
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