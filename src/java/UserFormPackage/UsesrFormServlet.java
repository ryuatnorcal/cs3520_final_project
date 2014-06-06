/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserFormPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

/**
 *
 * @author ryutaromatsuda
 */
public class UsesrFormServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    PrintWriter out = response.getWriter();
    String user = request.getParameter("username");
    String pw = request.getParameter("password");
    String email = request.getParameter("email");
    String sessionExit = request.getParameter("sessionExit");
    if(sessionExit==null||sessionExit.isEmpty()){sessionExit = "false";}
    Users current_user;
    out.println("pre "+sessionExit +" "+ user + " "+pw);
    
    HttpSession session = request.getSession();
    current_user = (Users) session.getAttribute("current_user");   
    if(current_user == null){   
     // if(userDB.isUserExist(user,pw)){  
        current_user = new Users();
       // current_user = userDB.findUser(user, pw);
        
        //current_user.setUser(user); 
        
     //   sessionExit = "false";
        out.println("pass throiugh db  ");
    // }
      //current_user.setLogin(true);
    }  
    if("false".equals(sessionExit)){  
      //if(userDB.isUserExist(user,pw)==1){ out.println("error 1");}
      //if(userDB.isUserExist(user,pw)==2){ out.println("error 2");}
      //if(userDB.isUserExist(user,pw)==3){ out.println("error 3");}
      if(userDB.isUserExist(user,pw)==1){
        
        current_user.setUser(user); 
        current_user.setLogin(true);
        session.setAttribute("current_user",current_user);
      }
       // session.setAttribute("sessionExit","false");
       // session.setAttribute("username",user);
        out.println("set session attributes");
    }
    else{ 
      out.println("delete session");
      session.setMaxInactiveInterval(-1);
      current_user.deleteUserSession();
      
    }
    
    
    
    
   //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
   // dispatcher.forward(request, response);
    // return to main 
    response.sendRedirect("../index.jsp");
    //response.setContentType("text/html; charset=UTF-8");
    //PrintWriter out = response.getWriter();
    //out.println(user);
    //out.close();
    
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    doPost(request,response);
  }
  
}
