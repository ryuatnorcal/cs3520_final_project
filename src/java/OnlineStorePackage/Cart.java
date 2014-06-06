/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OnlineStorePackage;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ryutaromatsuda
 */
public class Cart implements Serializable{
  private ArrayList<LineItem> items;
  public Cart(){  items = new ArrayList<LineItem> ();  }
  public ArrayList<LineItem> getItems(){return items; }
  public int getCount(){  return items.size();  }
  public void addItem(LineItem item){
    int id = item.getProduct().getId();
    int qt = item.getQuantity();
    for(int i=0;i<items.size();i++){
      LineItem lineItem = items.get(i);
      // id is already int so it cannot use equals option
      if(lineItem.getProduct().getId() == id){
       lineItem.setQuantity(qt);
       return;
      }
    }
    items.add(item);
    
  }
  public void removeItem(LineItem item){
    int id = item.getProduct().getId();
    for(int i = 0; i < items.size(); i++){
      items.remove(i);
      return;
    }
  }
}
