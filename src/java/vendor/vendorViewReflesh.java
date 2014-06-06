/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendor;

import java.io.*;
import java.io.PrintWriter;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author ryutaromatsuda
 */
public class vendorViewReflesh extends HttpServlet{
  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    
   reflesh(request,response);
  
   response.sendRedirect("../resources/vendor/index.jsp");
  }
  public static void reflesh(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    ResultSet top_rs = null;
    ResultSet bottom_rs = null;
    ResultSet surf_rs = null;
    ArrayList<vendorItem> top_lists = new ArrayList<vendorItem>();
    ArrayList<vendorItem> bottom_lists = new ArrayList<vendorItem>();
    ArrayList<vendorItem> surf_lists = new ArrayList<vendorItem>();
    HttpSession session = request.getSession();
    vendorItemList topItems = (vendorItemList) session.getAttribute("topItems");
    vendorItemList bottomItems = (vendorItemList) session.getAttribute("bottomItems");
    vendorItemList SurfItems = (vendorItemList) session.getAttribute("SurfItems");
    vendorItem item = null;
    PrintWriter out = response.getWriter();
  try{
    top_rs = vendorDB.getResultSetByCategory("top");
    bottom_rs = vendorDB.getResultSetByCategory("bottom");
    surf_rs = vendorDB.getResultSetByCategory("surf");
    /* if(vendorDB.getResultSetByCategory("top")==0){out.print("cennection failure");}
     if(vendorDB.getResultSetByCategory("top")==1){out.print("query failure");}
     if(vendorDB.getResultSetByCategory("top")==2){out.print("result failure");}
     if(vendorDB.getResultSetByCategory("top")==3){out.print("success");}*/
    vendorItem tops;
    vendorItem bottoms;
    vendorItem surfs;
    int i =0;
    while(top_rs.next()){
      tops = new vendorItem();
      tops.setId(top_rs.getInt("item_id"));
      tops.setTitle(top_rs.getString("item_title"));
      tops.setDesc(top_rs.getString("item_desc"));
      tops.setPrice(top_rs.getFloat("item_price"));
      tops.setQt(top_rs.getInt("item_qt"));
      tops.setCategory(top_rs.getString("item_category"));
      tops.setImagePath(top_rs.getString("item_image_path"));
      top_lists.add(tops);
      out.print(i);
    }
    while(bottom_rs.next()){
      bottoms = new vendorItem();
      bottoms.setId(bottom_rs.getInt("item_id"));
      bottoms.setTitle(bottom_rs.getString("item_title"));
      bottoms.setDesc(bottom_rs.getString("item_desc"));
      bottoms.setPrice(bottom_rs.getFloat("item_price"));
      bottoms.setQt(bottom_rs.getInt("item_qt"));
      bottoms.setCategory(bottom_rs.getString("item_category"));
      bottoms.setImagePath(bottom_rs.getString("item_image_path"));
      bottom_lists.add(bottoms);
      out.print(i);
    }
    while(surf_rs.next()){
      surfs = new vendorItem();
      surfs.setId(surf_rs.getInt("item_id"));
      surfs.setTitle(surf_rs.getString("item_title"));
      surfs.setDesc(surf_rs.getString("item_desc"));
      surfs.setPrice(surf_rs.getFloat("item_price"));
      surfs.setQt(surf_rs.getInt("item_qt"));
      surfs.setCategory(surf_rs.getString("item_category"));
      surfs.setImagePath(surf_rs.getString("item_image_path"));
      surf_lists.add(surfs);
      out.print(i);
    }
    session.setAttribute("tops", top_lists);
    session.setAttribute("bottoms",bottom_lists);
    session.setAttribute("surfs",surf_lists);
    
   }
   catch(Exception e){
     out.print("exception");
     e.printStackTrace();
   }
  }
}
