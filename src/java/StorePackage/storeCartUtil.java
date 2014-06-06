/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StorePackage;

/**
 *
 * @author ryutaromatsuda
 */
public class storeCartUtil {
  private String item_name;
  private String item_size;
  private String item_qt;
  private String item_id ;
  private String item_price;
  
  public storeCartUtil(){
    item_name = null;
    item_size = null;
    item_price = null;
    item_qt = null;
    item_id = null;    
  }
  public storeCartUtil(String name, String size, String price, String qt, String id){
    this.item_name = name;
    this.item_price = price;
    this.item_size =size;
    this.item_qt = qt;
    this.item_id = id;
    
  }
  public void setItemName(String item){  item_name = item; }
  public void setItemSize(String size){ item_size = size; }
  public void setItemPrice(String price){ item_price = price; }
  public void setItemQt(String qt){ item_qt = qt; }
  public void setItemId(String id){ item_id =id;  }
  
  public String getItemName(){  return item_name; }
  public String getItemSize(){  return item_size; }
  public String getItemPrice(){ return item_price;  }
  public String getItemQt(){  return item_qt;  }
  public String getItemId(){  return item_id; }
}
