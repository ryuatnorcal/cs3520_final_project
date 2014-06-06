<%-- 
    Document   : venderIndex
    Created on : May 19, 2014, 10:51:36 PM
    Author     : ryutaromatsuda
--%>

<%@include file="../Scripts/header.jsp" %>
  <body>
    <div id="wrapper">
        <h1>Vendor </h1>
        <div class="one_row">
          <h3>Publish New Item </h3>
          <form action="../../vendor/vendorItemServlet" enctype="multipart/form-data" method="post">
            <input type="hidden" name="formFor" value="new"/>
          <table id="vendor_add_item" class="padding_LR_ten">
            <tr>
              <td>Item </td>
              <td><input size="52" class="border_true" type="text" name="item_title" value="" /></td>              
            </tr>
            <tr>
                <td>Description</td>
                <td><textarea rows="10" cols="50" name="item_desc">Description</textarea></td>                
            </tr>
            <tr>
              <td>Price</td>
              <td><input size="52" class="border_true" type="text" name="item_price" value="" /></td>
            </tr>
            <tr>
              <td>Qt.</td>
              <td><input size="52" class="border_true" type="text" name="item_qt" value="" /></td>
            </tr>
            <tr>
              <td>Category</td>
              <td>
              <select class="border_true black_font" name="item_category">
                <option value="top" />Top
                <option value="bottom" />Bottom
                <option value="surf" />Surf
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
