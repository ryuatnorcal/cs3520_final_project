/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StorePackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author ryutaromatsuda
 */
public class StoreServlet extends HttpServlet { 
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String user = request.getParameter("username");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    String addr1 = request.getParameter("address1");
    String addr2 = request.getParameter("address2");
    String city = request.getParameter("city");
    String zip = request.getParameter("zip");
    String state = request.getParameter("state");
    int qt = Integer.parseInt(request.getParameter("qt"));
    int item_id = Integer.parseInt(request.getParameter("item_id"));
    
  }
}
  
