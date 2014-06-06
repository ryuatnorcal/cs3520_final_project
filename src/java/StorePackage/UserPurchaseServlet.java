/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StorePackage;
import OnlineStorePackage.Cart;
import OnlineStorePackage.LineItem;
import OnlineStorePackage.Products;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author ryutaromatsuda
 */
public class UserPurchaseServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      String item_title = request.getParameter("item_name");
      int item_id =(Integer)  Integer.parseInt(request.getParameter("item_id"));
      Double item_price = (Double) Double.parseDouble(request.getParameter("item_price"));
      String item_desc = request.getParameter("item_desc");
      String item_size = request.getParameter("item_size");
      String page_id = request.getParameter("cameFrom");
      int item_qt = (Integer) Integer.parseInt(request.getParameter("qt"));
      String item_image_path = request.getParameter("image_path");
      page_id = "../storeIndex.jsp?id=#" + page_id;
      
      HttpSession session = request.getSession();
      Cart cart = (Cart) session.getAttribute("cart");
      if(cart == null) {  cart = new Cart();  }
      try{
        if(item_id<1){  item_id = 1; }
        if(item_price <1){ item_price = 1.00; }
    
      }
      catch(NumberFormatException nfe){
        item_id = 1;
        item_price = 1.0;
      }
      
      
      
      // create products 
      Products p = new Products(item_id,item_desc,item_price,item_size,item_title,item_qt,item_image_path);
      LineItem lineItem = new LineItem(p,item_qt);
      
      
      if(item_qt == 0){  cart.removeItem(lineItem); }
      else if (item_qt > 0){ cart.addItem(lineItem);} 
      
      session.setAttribute("cart", cart);
      //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
      //dispatcher.forward(request, response);
      response.sendRedirect(page_id);  
  }
}
