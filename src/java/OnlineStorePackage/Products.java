/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OnlineStorePackage;

import java.io.Serializable;
import java.text.NumberFormat;

/**
 *
 * @author ryutaromatsuda
 */
public class Products implements Serializable{
  // define private variables 
  private int id;
  private String description; 
  private double price;
  private String size;
  private String title;
  private int qt; // this may take care in LineItem
  private int remine_qt;  // this could take care in LineItem
  private String image_path; 
  
  // default constructor 
  public Products(){
    id = 100; price =0.0; qt = 0; remine_qt = 0;
    description = ""; title = ""; image_path = "";
  }
  
     
  public Products(int id,String desc,Double price,
              String size,String title,int qt,String image_path){
    this.id = id; 
    this.description = desc; 
    this.price = price;
    this.size = size; 
    this.title = title; 
    this.qt = qt; 
    this.image_path = image_path;            
  }
  public void setId(int id){  this.id = id; }
  public void setDescription(String desc){this.description = desc;  }
  public void setPrice(Double price){this.price = price;  }
  public void setSize(String size){  this.size = size; }
  public void setTitle(String title){ this.title = title; }
  public void setQt(int qt){  this.qt = qt;}
  public void setRemineQt(int remQt){ this.remine_qt = remQt; }
  public void setImgPath(String imgPath){this.image_path = imgPath; }
  
  public int getId(){ return id; }
  public String getDescription(){return description; }
  public Double getPrice(){return price; }
  public String getSize(){return size; }
  public String getTitle(){ return title;  }
  public int getQt(){return qt;  }
  public int getRemQt(){return remine_qt;  }
  public String getImgPath(){ return image_path; }
  public String getPriceCurrencyFormat(){
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    return currency.format(price);
  }
}
