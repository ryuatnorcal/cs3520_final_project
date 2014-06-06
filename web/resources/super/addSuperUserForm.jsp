<%-- 
    Document   : addSuperUserForm
    Created on : May 7, 2014, 12:21:38 PM
    Author     : ryutaromatsuda
--%>
<%@include file="../Scripts/header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <body>
    <div id="wrapper">
      <div class="sub_wrapper">
        <div class="two_rows padding_top_ten">
          <form action="../../superUserPackage/superUserRegistrationServlet" method="post">
            <h3> Create Username And Password </h3>
            <div class="two_colums margin_top_ten">
            <table>
              <tr>
               <td>Username</td>
               <td><input type="text" name="username" class="border_true" /></td>
              </tr>
              <tr>
                <td>Password</td>
                <td><input type="password" name="pw" class="border_true" /></td>
              </tr>
            </table>
            </div>
            <div class="two_colums">
            <table>
              <tr>
                <td>First Name</td>
                <td><input type="text" name="first" class="border_true" /></td>
              </tr>
              <tr>
                <td>Last Name</td>
                <td><input type="text" name="last" class="border_true" /></td>
              </tr>
              <tr>
                <td>Address 1</td>
                <td><input type="text" name="addr1" class="border_true" /></td>
              </tr>
              <tr>
                <td>Address 2</td>
                <td><input type="text" name="addr2" class="border_true" /></td>
              </tr>
              <tr>
                <td>City </td>
                <td><input type="text" name="city" class="border_true" /></td>
              </tr>
              <tr>
                <td>ZIP</td>
                <td><input type="text" name="zip" class="border_true" /></td>
              </tr>
              <tr><td>State</td>
              <td>
                  <select name="area" id="selector_usa" class="black_font">
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
                  <td>Employee ID </td>
                  <td><input type="text" name="recommended_id" class="border_true text_right" /></td>
                </tr>
                <tr>
                  <td><input class='form_button rounded_corner bold' type="submit" value="Submit" /></td>
                  <td><input class="form_button rounded_corner bold" type="reset" value="Clear" /></td>
                </tr>
            </table>
            </div>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
