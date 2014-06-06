/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendor;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ryutaromatsuda
 */
public class vendorDeleteItemServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
  String item_for = request.getParameter("formFor");
  int item_id = (int) parseInt(request.getParameter("item_id"));
  if(item_for.equals("delete")){
   vendorItem item = new vendorItem();
   item.setId(item_id);
   int db = vendorDB.delete(item);
   
   HttpSession session = request.getSession();
    vendorItemList topItems = (vendorItemList) session.getAttribute("topItems");
    vendorItemList bottomItems = (vendorItemList) session.getAttribute("bottomItems");
    vendorItemList SurfItems = (vendorItemList) session.getAttribute("SurfItems");
    vendorViewReflesh.reflesh(request, response);
  
   response.sendRedirect("../resources/vendor/index.jsp?id=#listView");
   }
  }
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
   
    doPost(request,response);
  }
}
