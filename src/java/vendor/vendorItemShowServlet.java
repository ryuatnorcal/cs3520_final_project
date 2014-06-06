/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendor;
import dbConnectorPackage.DBUtil;
import dbConnectorPackage.dbConnection;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author ryutaromatsuda
 */
public class vendorItemShowServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
    String category = request.getParameter("item_category");
    vendorItem items = null;
    vendorItemList itemLists = new vendorItemList();
    int item_id;
    String item_title;
    String item_desc;
    float item_price;
    int item_qt;
    String item_category;
    String item_image_path;
    int item_rem_qt;
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    try{
    String search_query = "SELECT * FROM Items WHERE item_category = '" + category +"'";
    ps = connection.prepareStatement(search_query);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rsmd = rs.getMetaData();
    while(rs.next()){
      item_id = rs.getInt("item_id");
      item_title = rs.getString("item_title");
      item_desc = rs.getString("item_desc");
      item_price = rs.getFloat("item_price");
      item_qt = rs.getInt("item_qt");
      item_category = rs.getString("item_category");
      item_image_path = rs.getString("item_image_path");
      items = new vendorItem(item_id,item_title,item_desc,item_price,item_qt,item_category,item_image_path);
      itemLists.addItem(items);
    }
    }
    catch(SQLException e){
      e.printStackTrace();
      
    }
     response.sendRedirect("../resources/vendor/index.jsp");  
  }
  
}
