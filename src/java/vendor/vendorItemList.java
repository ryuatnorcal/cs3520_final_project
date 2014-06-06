/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendor;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author ryutaromatsuda
 */
public class vendorItemList implements Serializable {
  private ArrayList<vendorItem> items;
  private vendorItem item; 
  public vendorItemList(){  items = new ArrayList<vendorItem>(); }
  public vendorItemList(vendorItem item){items = new ArrayList<vendorItem>(); this.item =item;}
  public vendorItem getItem(){  return this.item;  }
  public ArrayList<vendorItem> getItemLists(){  return items; }
  public int getCount(){  return items.size();  }
  public void addItem(vendorItem item){  items.add(item); this.item =item; }
}
