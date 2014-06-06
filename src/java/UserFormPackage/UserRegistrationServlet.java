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
public class UserRegistrationServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String firstName = request.getParameter("first_name");
    String lastName = request.getParameter("last_name");
    String user = request.getParameter("username");
    String pw = request.getParameter("pw");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    String addr1 = request.getParameter("address1");
    String addr2 = request.getParameter("address2");
    String city = request.getParameter("city");
    String zip = request.getParameter("zip");
    String state = request.getParameter("state");
    String full_addr = addr1 +" "+ addr2 + " " + city + ", " + state + " " + zip; 
    boolean isVender = false;
    // SQL check 
    
    Users usr;
    Users let_me_login;
    // check username from SQL table if it does exist then show error 
    
    // store to SQL table 
    usr = new Users(firstName,lastName,email,phone,addr1,addr2,full_addr,city,zip,state,isVender,user,pw);
    int db = userDB.insert(usr);
    PrintWriter out = response.getWriter();
    if(db == 0){ out.print("connection error ");}
    else if(db==-1){ 
        
        out.print("query error ");
    }
    else{out.print("success");}
    HttpSession session = request.getSession();
    //RequestDispatcher rd = request.getRequestDispatcher("../UserFormPackage/UsesrFormServlet");
    let_me_login = new Users(user);
    session.setAttribute("current_user",let_me_login);
    response.sendRedirect("../index.jsp");
    
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse respone ) throws ServletException, IOException {
    doPost(request,respone);
  }
 
}
