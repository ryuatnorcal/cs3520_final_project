/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbConnectorPackage;
// this is connection pool class 
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;

/**
 *
 * @author ryutaromatsuda
 */
public class dbConnection {
  private static dbConnection pool = null;
  private static DataSource dataSource = null;
  
  private dbConnection (){
    try{
      InitialContext ic = new InitialContext();
      dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/cs3520");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  public static dbConnection getInstance(){
    if(pool == null ){  pool = new dbConnection();}
    return pool;
  }
  
  public Connection getConnection(){
    try{  Class.forName("com.mysql.jdbc.Driver"); }
    catch(ClassNotFoundException e){  e.printStackTrace();  }
    
    try{
      String dbURL = "jdbc:mysql://localhost:3306/cs3520?zeroDateTimeBehavior=convertToNull";
      String user = "root";
      String password = ""; // default pw : blank 
      Connection connection = DriverManager.getConnection(dbURL,user,password);
      
      return connection;
    }
    catch(SQLException sqle){
      sqle.printStackTrace();
      return null;
    }
  }
  
  public void freeConnection(Connection con){
    try{
      con.close();
    }
    catch(SQLException sqle){
      sqle.printStackTrace();
    }
  }
}
