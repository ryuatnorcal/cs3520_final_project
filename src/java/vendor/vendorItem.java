/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendor;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ryutaromatsuda
 */
public class vendorItem {
  private int item_id;
  private String item_title;
  private String item_desc;
  private float item_price;
  private int item_qt;
  private String item_category;
  private String item_image_path;
  private int item_rem_qt;
  vendorItem items;
  vendorItemList itemLists = new vendorItemList(); 
  
  public vendorItem(){
    this.item_id = 0;
    this.item_title = "title";
    this.item_desc = "desc"; 
    this.item_price = 0;
    this.item_qt = 0;
    this.item_category = "non";
    this.item_image_path = "defult";
    this.item_rem_qt = 0;  
  }
  public vendorItem(String title, String desc, float price, int qt, String category,String image_path, int rem_qt){  
    this.item_id =0; // moc id 
    this.item_title = title;
    this.item_desc = desc; 
    this.item_price = price;
    this.item_qt = qt;
    this.item_category = category;
    this.item_image_path = image_path;
    this.item_rem_qt = rem_qt;  
  }
  
  public vendorItem(int id, String title, String desc, float price, int qt, String category,String image_path){  
    this.item_id = id;
    this.item_title = title;
    this.item_desc = desc; 
    this.item_price = price;
    this.item_qt = qt;
    this.item_category = category;
    this.item_image_path = image_path;
  }
  
  public int getId(){ return this.item_id; }
  public String getTitle(){ return this.item_title;  }
  public String getDesc(){  return this.item_desc; }
  public float getPrice(){ return this.item_price;  }
  public int getQt(){  return this.item_qt; }
  public String getCategory(){  return this.item_category; }
  public String getImagePath(){ return this.item_image_path; }
  public int getRemQt(){  return this.item_rem_qt; }
  
  public void setId(int i){ this.item_id = i;  }
  public void setTitle(String s){ this.item_title = s;  }
  public void setDesc(String s){this.item_desc = s; }
  public void setPrice(float f){this.item_price = f;  }
  public void setQt(int i){ this.item_qt = i; }
  public void setCategory(String s){ this.item_category = s; }
  public void setImagePath(String s){ this.item_image_path = s; }
  public void setRemQt(int i){ this.item_rem_qt = i;  }
  
}
