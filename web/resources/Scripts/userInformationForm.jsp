
<div class="two_rows level6">
  <h1>Sign UP! </h1>
  
  <form name="regForm" action="UserFormPackage/UserRegistrationServlet" onSubmit="return userRegFrom();" method="post">
  <div class="two_colums">
    <div id="error_msg_box" class="error_msg_box msg hide font-red"></div>
    <h2>Create User </h2>
    <p>What should we call you?</p>
    
      <table>
        <tr>
          <td>USER NAME : </td>
          <td><input type="text" name="username" /></td>
        </tr>
        <tr>
          <td>PASSWORD : </td>
          <td><input type='password' name='pw' /></td>
        </tr>
      </table>
      
    </div><!-- end of two column -->
    <div class="two_colums">
      <h2> Shipping Address </h2>
      <p>Where should we send awesome packages? </p>
      <table>  
        <tr><td>First : </td><td><input type="text" name="first_name" value="" /></td></tr>
        <tr><td>Last : </td><td><input type="text" name="last_name" value="" /></td></tr>
        <tr><td>Email : </td><td><input type="text" name="email" value="" /></td></tr>
        <tr><td>phone : </td><td><input type="text" name="phone" value="" /></td></tr>
        <tr><td>Address1 : </td><td><input type="text" name="address1" value="" /></td></tr>
        <tr><td>Address2 : </td><td><input type="text" name="address2" value="" /></td></tr>
        <tr><td>City : </td><td><input type="text" name="city" value="" /></td></tr>
        <tr><td>ZIP : </td><td><input type="text" name="zip" value="" /></td></tr>
        
        <!-- This selector may good for later  -->
        <tr><td>State</td>
            <td>
                <select name="state" id="selector_usa">
                    <option value="AL" />Alabama
                    <option value="AK" />Alaska
                    <option value="AS" />American Samoa
                    <option value="AZ" />Arizona
                    <option value="AR" />Arkansas
                    <option value="CA" selected />California
                    <option value="CO" />Colorado
                    <option value="CT" />Connecticut
                    <option value="DE" />Delaware
                    <option value="DC" />Dist. of Columbia
                    <option value="FL" />Florida	
                    <option value="GA" />Georgia
                    <option value="GU" />Guam
                    <option value="HI" />Hawaii
                    <option value="ID" />Idaho
                    <option value="IL" />Illinois
                    <option value="IN" />Indiana
                    <option value="IA" />Iowa
                    <option value="KS" />Kansas
                    <option value="KY" />Kentucky
                    <option value="LA" />Louisiana
                    <option value="ME" />Maine
                    <option value="MD" />Maryland
                    <option value="MH" />Marshall Islands
                    <option value="MA" />Massachusetts
                    <option value="MI" />Michigan
                    <option value="FM" />Micronesia
                    <option value="MN" />Minnesota
                    <option value="MS" />Mississippi
                    <option value="MO" />Missouri
                    <option value="MT" />Montana
                    <option value="NE" />Nebraska
                    <option value="NV" />Nevada
                    <option value="NH" />New Hampshire
                    <option value="NJ" />New Jersey
                    <option value="NM" />New Mexico
                    <option value="NY" />New York
                    <option value="NC" />North Carolina
                    <option value="ND" />North Dakota
                    <option value="MP" />Northern Marianas
                    <option value="OH" />Ohio
                    <option value="OK" />Oklahoma
                    <option value="OR" />Oregon
                    <option value="PW" />Palau
                    <option value="PA" />Pennsylvania
                    <option value="PR" />Puerto Rico
                    <option value="RI" />Rhode Island
                    <option value="SC" />South Carolina
                    <option value="SD" />South Dakota
                    <option value="TN" />Tennessee
                    <option value="TX" />Texas
                    <option value="UT" />Utah
                    <option value="VT" />Vermont
                    <option value="VA" />Virginia
                    <option value="VI" />Virgin Islands
                    <option value="WA" />Washington
                    <option value="WV" />West Virginia
                    <option value="WI" />Wisconsin
                    <option value="WY" />Wyoming
                 </select>
            </td>
        </tr>
        
        <tr>
          <td><input class='form_button rounded_corner bold' type="submit" value="Submit" /></td>
          <td><input class="form_button rounded_corner bold" type="reset" value="Clear" /></td>
        </tr>        
    </table>       
  </div><!-- end of two columns -->
</form>  
</div><!-- end of two row -->
