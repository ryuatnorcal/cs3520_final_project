/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adminUserPackage;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author ryutaromatsuda
 */
public class adminUserLoginServlet extends HttpServlet{
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String admin = request.getParameter("username");
    String password = request.getParameter("pw");
    
    // go throuh the SQL table to authoticate user 
    
    // if authoticate success then go to admin_dashboard 
    // if not return to login page. 
   
    response.sendRedirect("admin_dashboard.jsp");
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse respone ) throws ServletException, IOException{
    doPost(request,respone );
  }
}
