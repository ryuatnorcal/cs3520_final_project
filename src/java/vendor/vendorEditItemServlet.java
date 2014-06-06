/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import vendor.vendorItemServlet;
/**
 *
 * @author ryutaromatsuda
 */
public class vendorEditItemServlet extends HttpServlet{
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
    PrintWriter out = response.getWriter();
    vendorItem item = new vendorItem(); 
    int item_id = (int) parseInt(request.getParameter("item_id"));
    String item_for = request.getParameter("formFor");
    String item_title = request.getParameter("item_title");
    String item_desc = request.getParameter("item_desc");
    float  item_price = (float) parseFloat(request.getParameter("item_price"));
    int    item_qt =  (int) parseInt(request.getParameter("item_qt"));
    String item_category = request.getParameter("item_category");
    item.setId(item_id);
    item.setTitle(item_title);
    item.setDesc(item_desc);
    item.setPrice(item_price);
    item.setQt(item_qt);
    item.setCategory(item_category);
   
    int db = vendorDB.update(item);
    
    response.sendRedirect("../resources/vendor/index.jsp");
    
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
   PrintWriter out = response.getWriter();
   int item_id = (int) parseInt(request.getParameter("item_id"));
   HttpSession session = request.getSession();
    try{
          ResultSet rs = vendorDB.getResultSetById(item_id);
          if(rs.next()){
            vendorItem item = new vendorItem();
            item.setId(item_id);
            item.setTitle(rs.getString("item_title"));
            item.setDesc(rs.getString("item_desc"));
            item.setPrice(rs.getFloat("item_price"));
            item.setQt(rs.getInt("item_qt"));
            item.setCategory(rs.getString("item_category"));
            item.setImagePath(rs.getString("item_image_path"));
            session.setAttribute("item",item);
            out.println("session passed");
          }
      }catch(SQLException e){ out.println(e);}
      
      
      response.sendRedirect("../resources/vendor/vendorEditItem.jsp");
   
  }
}
