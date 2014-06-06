
<div class="one_row level6">
  <div id="loginForm" class="FormWrapper">
  <h1>Log In! </h1>
  <div id="error_msg_box" class="error_msg_box msg hide font-red level6"></div>
  <form name="userlogin" action="UserFormPackage/UsesrFormServlet" onSubmit="return userLoginForm()" method="post">
    <input type="hidden" name="sessionExit" value="false" />
    <table>
      <tr>
        <td>USER NAME : </td>
        <td><input type="text" name="username" value=""/></td>
      </tr>
      <tr>
        <td>PASSWORD : </td>
        <td><input type="password" name="password" value=""/></td>
      </tr>
      <tr>
        
        <td><input class='form_button rounded_corner bold' type="submit" value="Login!" /></td>
        <td><input class="form_button rounded_corner bold" type="reset" value="Clear" /></td>
      </tr>
    </table>
  </form>
  </div><!-- end of FormWrapper -->
</div>
  