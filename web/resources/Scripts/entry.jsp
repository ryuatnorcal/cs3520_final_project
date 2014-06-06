<%-- 
    Document   : entry
    Created on : Apr 14, 2014, 9:04:58 PM
    Author     : ryutaromatsuda
--%>
<!-- @import Java libs-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/base.css" rel="stylesheet" type="text/css" />
        <!-- @import JQuery -->
        <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
        <!-- @import JQuery UI -->
        <script src="../javascript/jquery-ui-1.10.4.min.js"></script>
        <script src="../javascript/base.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Java code -->
        <%
            // use get method to obtain params 
            String first = request.getParameter("first");
            String last = request.getParameter("last"); 
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String user = request.getParameter("user");
            String pw = request.getParameter("pw");
            String addr1 = request.getParameter("addr1");
            String addr2 = request.getParameter("addr2");
            String city = request.getParameter("city");
            String zip = request.getParameter("zip");
            String contactMethod = request.getParameter("contactMethod");
            String area = request.getParameter("area");
            String full_addr = addr1 + "\n"+ addr2 + " " + city +", "+area+" "+ zip;
            String fix_url = "../../index.jsp?is_fix=true&first="+first+"&last="+last+"&phone="+phone+"&email="+email+"&pw="+pw+"&user="+user+"&addr1="+addr1+"&addr2="+addr2+"&city="+city+"&zip="+zip+"&area="+area;
            
        %>
        
        <div id="wrapper">
            <div id="message" class="rounded_corner rotationfive">
                <h1>'Allo 'Allo <%= first %>, <%= last %>!!</h1>
                    <p> We got your information as... </p>
                    <table>
                        <tr><td>User Name </td><td><%= user %></td></tr>
                        <tr><td>Password </td><td><%= pw %></td></tr>
                        <tr><td>First Name </td><td><%= first %></td></tr>
                        <tr><td>Last Name </td><td><%= last %></td></tr>
                        <tr><td>Phone </td><td><%= phone %></td></tr>
                        <tr><td>Address </td><td><%= full_addr %></td></tr>
                    </table>
                    <a href="../../index.jsp" title="home" alt="go home ">Go back Home </a><br />
                    <a href="<%= fix_url %>" title="fix" alt="let me fix">Made some mistake ? No sweat, click here to fix the information</a>
            </div>
        </div>
    </body>
</html>
