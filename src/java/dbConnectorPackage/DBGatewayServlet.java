/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbConnectorPackage;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
/**
 *
 * @author ryutaromatsuda
 */
public class DBGatewayServlet {
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
     String sqlStatement = request.getParameter("sqlStatement");
     String sqlResult = "";
     
     try{
       String dbURL = "jdbc:mysql://localhost:3306/cs3520?zeroDateTimeBehavior=convertToNull";
       String user = "root";
       String password = ""; // default pw : blank 
       Connection connection = DriverManager.getConnection(dbURL,user,password);
       
       Statement statement = connection.createStatement();
       
       sqlStatement = sqlStatement.trim();
       if(sqlStatement.length() >= 6){
         String sqlType = sqlStatement.substring(0,6);
         if(sqlType.equalsIgnoreCase("select")){
           ResultSet resultSet = statement.executeQuery(sqlStatement);
           // sqlResult = call function to get result 
           resultSet.close();
         }
       }
       else{
         int i = statement.executeUpdate(sqlStatement);
         if(i==0){
           sqlResult = "The statement executed successfully.";
         }
         else{
           sqlResult = "The statement executed successfully <br />"+ i + "row(s) affected";
         }
         statement.close();
         connection.close();
       }
     }
     catch(Exception e){
       sqlResult = "Error executing the SQL statement <br />" + e.getMessage();
     }
     HttpSession session = request.getSession();
     session.setAttribute("sqlResult",sqlResult);
     session.setAttribute("sqlStatement",sqlStatement);
     String url = "/sql_gateway.jsp";
     response.sendRedirect(url);
     
   } 
}
