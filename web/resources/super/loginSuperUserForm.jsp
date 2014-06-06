<%-- 
    Document   : loginSuperUserForm
    Created on : May 7, 2014, 12:52:09 PM
    Author     : ryutaromatsuda
--%>
<%@include file="../Scripts/header.jsp" %>
    <div id="wrapper">
      <div class="sub_wrapper">
        <div class="message">
          <h1>Login!</h1>
          <form action="../../superUserPackage/superUserLoginServlet" method="post">
            <table>
              <tr><td>Username</td><td><input type="text" name="username" class="border_true" /></td></tr>
              <tr><td>Password</td><td><input type="password" name="pw" class="border_true" /></td></tr>
              <tr>
                <td><input class='form_button rounded_corner bold' type="submit" value="Submit" /></td>
                <td><input class="form_button rounded_corner bold" type="reset" value="Clear" /></td>
              </tr>
            </table>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
