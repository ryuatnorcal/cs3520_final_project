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
public class LineItem implements Serializable{
  private Products product;
  private int quantity; 
  
  public LineItem(){ }
  public LineItem(Products p,int q){
    product = p; quantity = q;
  }
  public void setProduct(Products p){product = p; }
  public Products getProduct(){return product; }
  public void setQuantity(int quantity){this.quantity = quantity; }
  public int getQuantity(){return quantity;}
  public String getTotal(){
    Double total = product.getPrice() * quantity;
    return String.valueOf(total);
  }
  public String getTotalCurrencyFormat(){
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    return currency.format(this.getTotal());
  }
}
