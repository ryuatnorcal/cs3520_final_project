/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserFormPackage;
import java.sql.*;
import dbConnectorPackage.*;

/**
 *
 * @author ryutaromatsuda
 */
public class userDB{
  public static int insert(Users user){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    
    String insert_query = "INSERT INTO Users(first_name,last_name,email,phone,addr1,addr2,full_addr,city,zip,state,isVender,user,pw)"+
            " Values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    try{
      ps = connection.prepareStatement(insert_query);
      ps.setString(1, user.getFirstName());
      ps.setString(2, user.getLastName());
      ps.setString(3, user.getEmail());
      ps.setString(4, user.getPhone());
      ps.setString(5, user.getAddr1());
      ps.setString(6, user.getAddr2());
      ps.setString(7, user.getFullAddr());
      ps.setString(8, user.getCity());
      ps.setString(9, user.getZip());
      ps.setString(10, user.getState());
      ps.setBoolean(11, user.getIsVender());
      ps.setString(12, user.getUser());
      ps.setString(13, user.getPassword());      
      ps.addBatch();
      ps.executeBatch();
      return 99;
      //return ps.executeUpdate();
    }
    catch(SQLException e){
      e.printStackTrace();
      return -1;
    }
    finally{
      DBUtil.closePreparedStatement(ps);
      try{connection.close();}
      catch(Exception e){
        e.printStackTrace();
        return 0;
      }
    } 
  } 
  

  public static int update(Users user){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    String update_query ="UPDATE User SET "+
            "first_name = ?, "+ 
            "last_name = ?, "+
            "email = ?, " +
            "phone = ?, " +
            "addr1 = ?, " +
            "addr2 = ?, " +
            "full_addr = ?, " +
            "city = ?, " +
            "zip = ?, " +
            "state = ?, " +
            "isVender = ?, " +
            "user = ?, " + 
            "pw = ?, " +
            "WHERE user = ?" + " AND pw = ?";
    try{
      ps = connection.prepareStatement(update_query);
      ps.setString(1, user.getFirstName());
      ps.setString(2, user.getLastName());
      ps.setString(3, user.getEmail());
      ps.setString(4, user.getPhone());
      ps.setString(5, user.getAddr1());
      ps.setString(6, user.getAddr2());
      ps.setString(7, user.getFullAddr());
      ps.setString(8, user.getCity());
      ps.setString(9, user.getZip());
      ps.setString(10, user.getState());
      ps.setBoolean(11, user.getIsVender());
      ps.setString(12, user.getUser());
      ps.setString(13, user.getPassword()); 
      ps.addBatch();
      ps.executeBatch();
      return 99;
      //return ps.executeUpdate();
    }
    catch(SQLException e){
      e.printStackTrace();
      return 0;
    }
    finally{
      DBUtil.closePreparedStatement(ps);
      pool.freeConnection(connection);
    }
  }
  
  public static int delete(Users user){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    
    String delete_query = "DELETE FROM User WHERE user=? AND pw =?";
    try{
      ps = connection.prepareStatement(delete_query);
      ps.setString(1,user.getUser());
      ps.setString(2, user.getPassword());
      return ps.executeUpdate();
    }
    catch(SQLException e){
      e.printStackTrace();
      return 0;
    }
    finally{
      DBUtil.closePreparedStatement(ps);
      pool.freeConnection(connection);
    }
  }
  
  public static Users findUser(String user, String pw){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    String find_user_query = "SELECT * FROM Users WHERE user = ? AND pw= ?";
    try{
      ps = connection.prepareStatement(find_user_query);
      ps.setString(1, user);
      ps.setString(2, pw);
      
      rs = ps.executeQuery();
      //if(ps==null){return null;}
      Users cur_user = new Users();
      //,last_name,email,phone,addr1,addr2,full_addr,city,zip,state,isVender,user,pw
      if(rs.next()){
        
        cur_user.setId(rs.getInt("id"));
        cur_user.setFirstName(rs.getString("first_name"));
        cur_user.setLastName(rs.getString("last_name"));
        cur_user.setEmail(rs.getString("email"));
        cur_user.setPhone(rs.getString("phone"));
        cur_user.setAddr1(rs.getString("addr1"));
        cur_user.setAddr2(rs.getString("addr2"));
        cur_user.setFullAddr(rs.getString("full_addr"));
        cur_user.setCity(rs.getString("city"));
        cur_user.setZip(rs.getString("zip"));
        cur_user.setState(rs.getString("state"));
        cur_user.setIsVender(rs.getBoolean("isVender"));
        cur_user.setUser(rs.getString("user"));
      }
      return cur_user;
    }
    catch(SQLException e){
      e.printStackTrace();
      return null;
    }
    finally{
      DBUtil.closeResultSet(rs);
      DBUtil.closePreparedStatement(ps);
      try{connection.close();}
      catch(Exception e){
        e.printStackTrace();
        return null;
      }
    }
  }
  
  public static int isUserExist(String user, String pw){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    String find_user_query = "SELECT * FROM Users WHERE user = ? AND pw= ?";
    try{
      ps = connection.prepareStatement(find_user_query);
      ps.setString(1, user);
      ps.setString(2, pw);
      
      rs = ps.executeQuery();
      //return rs.next();
      if(rs.next()){return 1;}
      else{return 2;}
    }
    catch(SQLException e){
      e.printStackTrace();
      //return false;
      return 3;
    }
    finally{
      DBUtil.closeResultSet(rs);
      DBUtil.closePreparedStatement(ps);
      try{connection.close();}
      catch(Exception e){
        e.printStackTrace();
        //return false;
        return 4;
      }
    }
  }
}
 
