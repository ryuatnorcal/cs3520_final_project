/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendor;
import dbConnectorPackage.*;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author ryutaromatsuda
 */
public class vendorDB{
  
  public static int insert(vendorItem item){
    
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    if(connection == null){return 0;}
   
    try{
     String insert_query = "INSERT INTO Items(item_title,item_desc,item_price,item_qt,item_category,item_image_path) VALUE (?,?,?,?,?,?);";
      ps = connection.prepareStatement(insert_query);
      ps.setString(1, item.getTitle());
      ps.setString(2,item.getDesc());
      ps.setFloat(3,item.getPrice());
      ps.setInt(4,item.getQt());
      ps.setString(5,item.getCategory());
      ps.setString(6,item.getImagePath());
      ps.addBatch();
      ps.executeBatch();
      return 99;
    }
    catch(SQLException e){
      e.printStackTrace();
      return -1;
    }
    finally{
      DBUtil.closePreparedStatement(ps);
      // close expression did not work check pool.freeConnection
      //pool.freeConnection(connection);
      try{connection.close();}
      catch(Exception e){
        e.printStackTrace();
        return 0;
      }
    }
  }
  
  public static int update(vendorItem item){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    
    String update_string = "UPDATE Items SET item_title= ?,item_desc =?, item_price=?, item_qt=?,item_category=?"+
            "WHERE item_id=?";   

    try {
      ps = connection.prepareStatement(update_string);
      ps.setString(1,item.getTitle());
      ps.setString(2, item.getDesc());
      ps.setFloat(3, item.getPrice());
      ps.setInt(4, item.getQt());
      ps.setString(5, item.getCategory());
      ps.setInt(6,item.getId());
      ps.addBatch();
      ps.executeBatch();
      return 99;
    }
    catch(SQLException e){
      e.printStackTrace();
      return 1;
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
  
  public static int delete(vendorItem item){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    
    String delete_qury = "DELETE FROM Items WHERE item_id =?";
    try{
      ps = connection.prepareStatement(delete_qury);
      ps.setInt(1, item.getId());
      return ps.executeUpdate();      
    }
    catch(SQLException e){
      e.printStackTrace();
      return 0;
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
  public static ResultSet getResultSetById(int id) throws SQLException{
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    String search_query = "SELECT * FROM Items WHERE item_id = ?";
    ps = connection.prepareStatement(search_query);
    ps.setInt(1,id);
    ResultSet rs = ps.executeQuery();
    return rs;
  }
  public static ResultSet getResultSetByCategory(String category) throws SQLException
  {
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    //if(connection == null){return 0;}
    PreparedStatement ps = null;
    String search_query = "SELECT * FROM Items WHERE item_category = ?";
    ps = connection.prepareStatement(search_query);
    ps.setString(1,category);
   // if(ps ==null){return 1;}
    ResultSet rs = ps.executeQuery();
    //if(!rs.next()){return 2;  }
    //return 3;
    return rs;
  }
  
  public static vendorItemList getQueryItemsByCategory(String category) throws SQLException{
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
    String test_str ="";
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
        test_str = test_str +" "+item_id + " " + item_title;
        
        items = new vendorItem(item_id,item_title,item_desc,item_price,item_qt,item_category,item_image_path);
        itemLists.addItem(items);
      }
    }
    catch(SQLException e){
      e.printStackTrace();
      return null;
    }
    finally{
      DBUtil.closePreparedStatement(ps);
      //pool.freeConnection(connection);
       try{connection.close();}
      catch(Exception e){
        e.printStackTrace();
        
      }
    
    }
    return itemLists;
  }
  
  
  public static boolean isItemExist(int id){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    String search_query = "SELECT item_id FROM Items WHERE item_id = ?";
    
    try{
      ps = connection.prepareStatement(search_query);
      ps.setString(1, "id");
      rs = ps.executeQuery();
      return rs.next();
    }
    catch(SQLException e){
      e.printStackTrace();
      return false;
    }
    finally{
      DBUtil.closeResultSet(rs);
      DBUtil.closePreparedStatement(ps);
      try{connection.close();}
      catch(Exception e){
        e.printStackTrace();
        return false;
      }
    }
  }
  
  private void setMetadata(ResultSet rs ) throws SQLException{
    System.out.println("Colms in this table are ");
    System.out.println("Items" + rs.getMetaData().getTableName(1));
    for  (int i = 1; i<= rs.getMetaData().getColumnCount(); i++){
      System.out.println("Column " +i  + " "+ rs.getMetaData().getColumnName(i));
    }
  }
  
  public static vendorItem selectItem(int id){
    dbConnection pool = dbConnection.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    String search_query = "SELECT item_id FROM Items WHERE item_id = ?";
    
    try{
      ps = connection.prepareStatement(search_query);
      ps.setInt(1,id);
      rs = ps.executeQuery();
      vendorItem item = null;
      if(rs.next()){
        item = new vendorItem();
        item.setTitle(rs.getString("item_title"));
        item.setDesc(rs.getString("item_desc"));
        item.setPrice(rs.getFloat("item_price"));
        item.setQt(rs.getInt("item_qt"));
        item.setRemQt(rs.getInt("item_rem_qt"));
        item.setCategory(rs.getString("item_category"));
        item.setImagePath(rs.getString("item_image_path"));
      }
      return item;
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
  
}
