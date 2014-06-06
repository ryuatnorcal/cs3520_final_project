/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superUserPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
 /*
 * @author ryutaromatsuda
 */
public class superUserRegistrationServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String user = request.getParameter("username");
    String pw = request.getParameter("pw");
    String first = request.getParameter("first");
    String last = request.getParameter("last");
    String addr1 = request.getParameter("addr1");
    String addr2 = request.getParameter("addr2");
    String city = request.getParameter("city");
    String zip = request.getParameter("zip");
    String state = request.getParameter("state");
    String full_addr = addr1 + " " +addr2 + ", "+ city+ " " + state + " " + zip;
    String phone = request.getParameter("phone");
    String recommended_id = request.getParameter("recommended_id");
    // insert in to SQL table 
    
    
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    response.sendRedirect("../index.jsp");
  }
  
}
