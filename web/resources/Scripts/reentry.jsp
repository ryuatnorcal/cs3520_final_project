<%-- 
    Document   : reentry
    Created on : Apr 16, 2014, 10:07:24 AM
    Author     : ryutaromatsuda
--%>
<!-- @import Java dependencies -->
<%@page import="java.io.*,java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../css/base.css" rel="stylesheet" type="text/css" />
        <!-- @import JQuery -->
        <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
        <!-- @import JQuery UI -->
        <script src="resources/javascript/jquery-ui-1.10.4.min.js"></script>
        <script src="resources/jae.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fix Form </title>
    </head>
    <body>
        <%
            String first = request.getParameter("firstName");
            String last = request.getParameter("lastName"); 
            String phone = request.getParameter("phone");
            String contactMethod = request.getParameter("contactMethod");
            String area = request.getParameter("area");
        %>
        <div class="wrapper">
            <div id="message" class="rounded_corner">
                <h1>'Allo! 'Allo! </h1>
                <p>Take a mins to fill out our survey! </p>
                <form action="entry.jsp" method="get">
                        <table>
                            <!-- Contents rows -->
                            <tr><td>First Name </td><td> <input type="text" name="firstName" value="<%= first%>" /></td></tr>
                            <tr><td>Last Name </td><td><input type="text" name="lastName" value="<%= last %>" /></td></tr>
                            
                            <tr><td colspan="2">Which Smartphone do you use ? </td></tr>
                            <% if(phone == "Android"){ %>
                                <tr><td><input type="radio" name="phone" value="Android" checked="checked"></td><td>Android</td></tr>
                                <tr><td><input type="radio" name="phone" value="iOS"></td><td>iOS</td></tr>
                                <tr><td><input type="radio" name="phone" value="FireFox"></td><td>FireFox</td></tr>
                                <tr><td><input type="radio" name="phone" value="Neither"></td><td>Neither</td></tr>
                            <%} else if(phone == "iOS"){ %>
                                <tr><td><input type="radio" name="phone" value="Android"></td><td>Android</td></tr>
                                <tr><td><input type="radio" name="phone" value="iOS" checked="checked"></td><td>iOS</td></tr>
                                <tr><td><input type="radio" name="phone" value="FireFox"></td><td>FireFox</td></tr>
                                <tr><td><input type="radio" name="phone" value="Neither"></td><td>Neither</td></tr>
                             <%} else if(phone=="FireFox"){ %>
                                <tr><td><input type="radio" name="phone" value="Android"></td><td>Android</td></tr>
                                <tr><td><input type="radio" name="phone" value="iOS"></td><td>iOS</td></tr>
                                <tr><td><input type="radio" name="phone" value="FireFox" checked="checked"></td><td>FireFox</td></tr>
                                <tr><td><input type="radio" name="phone" value="Neither"></td><td>Neither</td></tr>
                             <%} else if(phone=="Neither"){ %>
                                <tr><td><input type="radio" name="phone" value="Android"></td><td>Android</td></tr>
                                <tr><td><input type="radio" name="phone" value="iOS"></td><td>iOS</td></tr>
                                <tr><td><input type="radio" name="phone" value="FireFox"></td><td>FireFox</td></tr>
                                <tr><td><input type="radio" name="phone" value="Neither" checked="checked"></td><td>Neither</td></tr>
                              <%} else { %>
                                <tr><td><input type="radio" name="phone" value="Android"></td><td>Android</td></tr>
                                <tr><td><input type="radio" name="phone" value="iOS"></td><td>iOS</td></tr>
                                <tr><td><input type="radio" name="phone" value="FireFox"></td><td>FireFox</td></tr>
                                <tr><td><input type="radio" name="phone" value="Neither"></td><td>Neither</td></tr>
                              <% } %>
                            <tr><td colspan="2">How should we contact you ? </td></tr>
                            <tr>
                                <td><input type="radio" name="contactMethod" value="email" width="1%"></td><td>Email</td>
                                <td><input type="radio" name="contactMethod" value="phone" width="1%"></td><td>Phone</td>
                                <td><input type="radio" name="contactMethod" value="mail" width="1%"></td><td>Classic Mail</td>
                                <td><input type="radio" name="contactMethod" value="all" width="1%"></td><td>Who Care! </td>
                            <tr>
                            <tr><td colspan="2">Where do you live? </td></tr>
                            <!-- This selector may good for later  -->
                            <tr>
                                <td>
                                    <select name="area" id="selector_usa">
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
                            <!-- footers  -->                      
                            <tr><td>
                                <div class="form_button small">
                                  <span>Submit</span> 
                                  <input class="defButton"type="submit" value="Submit" />
                                </div>
                                </td>                              
                            <td>
                              <div class="form_button small">
                                <span>Clear</span>
                                <input class="defButton" type="reset" value="Clear" />
                              </div>
                            </td>                              
                        </tr></table>
                  </form>
            </div>
        </div>
    </body>
</html>
