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

@WebServlet("/uploads")
@MultipartConfig
/**
 *
 * @author ryutaromatsuda
 */
public class vendorItemServlet extends HttpServlet{
  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    PrintWriter out = response.getWriter();
    String item_for = request.getParameter("formFor");
    Part filePart = request.getPart("file");
    String item_image_path = getFilename(filePart);
    String file_name = item_image_path + request.getParameter("file");
    InputStream filecontent = filePart.getInputStream();
   
    String item_title = request.getParameter("item_title");
    String item_desc = request.getParameter("item_desc");
    float  item_price = (float) parseFloat(request.getParameter("item_price"));
    int    item_qt =  (int) parseInt(request.getParameter("item_qt"));
    String item_category = request.getParameter("item_category");
    
    
    int item_rem_qt = 3;//(Integer) parseInt(request.getParameter("item_rem_qt"));
    HttpSession session = request.getSession();
    vendorItemList topItems = (vendorItemList) session.getAttribute("topItems");
    vendorItemList bottomItems = (vendorItemList) session.getAttribute("bottomItems");
    vendorItemList SurfItems = (vendorItemList) session.getAttribute("SurfItems");
    vendorItem item = null;
   
   
//out.println("Form field " + item_image_path + " with value "+ Streams.asString(filecontent) + " detected.");
    //out.print("filename : "+ item_image_path+ " ");
    String root = getServletContext().getRealPath("/");
   // List<FileItem> fileItemsList = uploader.parseRequest(request);
   // Iterator<FileItem> fileItemsIterator = fileItemsList.iterator();
   // FileItem item_file = (FileItem) iterator.next();
    File path = new File(root + "/uploads");
    File uploadedFile = new File(path + "/");
    File fileSaveDir = new File(path + "/");
    out.println(fileSaveDir);
    if (!fileSaveDir.exists()) {
      try{
      fileSaveDir.mkdir();
      }catch (Exception e){
        out.println("\ncould not create folder "+e + "\n");
      }
        
    }
    out.println(uploadedFile.getAbsolutePath());
    try{
    filePart.write(root +"/uploads/" + item_image_path);
    filecontent.close();
    }
    catch(Exception e){
      out.println("\n save error \n" + e);
    }
    out.print(root +"/uploads/" + item_image_path+"\n");
 
   out.print("price has "+item_price+" qt has "+ item_qt);
   //if(!price.isEmpty()){item_price = (float) parseFloat(price); }
   //if(!qt.isEmpty()){ item_qt = (int) parseInt(qt);}
    out.println(item_image_path);
    if(topItems == null){ topItems = new vendorItemList();  }
    if(bottomItems == null){ bottomItems = new vendorItemList();  }
    if(SurfItems == null){ SurfItems = new vendorItemList();  }
    
    if(item_for.equals("new")){
      item = new vendorItem(item_title,item_desc,item_price,item_qt,item_category,item_image_path,item_rem_qt);
      int db = vendorDB.insert(item);
      /*    if(db == 0){ out.print("connection error ");}
          else if(db==-1){ 
           // out.print(item.getTitle());
           // out.print(item.getCategory());
           // out.print(item.getId());
           // out.print(item.getDesc());
           // out.print(item.getPrice());
           // out.print("query error ");
        }
        else{out.print("success");}*/
   }
   
   
/*****************************************************************************
 * here is for second page 
 * ***************************************************************************/
  
    vendorViewReflesh.reflesh(request, response); 
  
   response.sendRedirect("../resources/vendor/index.jsp");
  }
  // get method is use for delete
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
   
    doPost(request,response);
  }
  public static String getFilename(Part part) {
    for (String cd : part.getHeader("content-disposition").split(";")) {
        if (cd.trim().startsWith("filename")) {
            String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
            return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
        }
    }
    return null;
  }
  public static String getValue(Part part) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(part.getInputStream(), "UTF-8"));
    StringBuilder value = new StringBuilder();
    char[] buffer = new char[1024];
    for (int length = 0; (length = reader.read(buffer)) > 0;) {
        value.append(buffer, 0, length);
    }
    return value.toString();
}
}
