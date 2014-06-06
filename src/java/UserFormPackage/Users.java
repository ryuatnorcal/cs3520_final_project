/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserFormPackage;
import java.io.Serializable;
/**
 *
 * @author ryutaromatsuda
 */
public class Users implements Serializable{
  
  private int id;
  private String first_name; 
  private String last_name;
  private String email;
  private String phone;
  private String addr1;
  private String addr2;
  private String full_addr;
  private String city;
  private String zip; 
  private String state;
  private Boolean isVender; 
  private String user;
  private String pw; 
  private Boolean user_loggedin;
  
  // default constructor 
  public Users(){
    id = 0; first_name = ""; last_name = "";
    email = ""; phone = ""; addr1 = "";
    addr2=""; full_addr=""; user_loggedin = false;
    city =""; city = ""; zip=""; state=""; user=""; pw="";
  }
  
  public Users(String user){
    this.user = user; 
    this.user_loggedin = true;
  }
  
  public Users(String firstName,
          String lastName, String email,String phone,
          String addr1, String addr2, String fullAddr, 
          String city,
          String zip, String state, Boolean isVender,
          String user,String pw){
          this.first_name = firstName;
          this.last_name = lastName;  this.email = email;  
          this.state = state; this.phone = phone;
          this.city = city;   this.zip = zip;
          this.isVender = isVender; this.user = user;
          this.pw = pw;
          
  }
  public Users(Users user){
    this.first_name = user.first_name;
    this.last_name = user.last_name;  this.email = user.email;  
    this.state = user.state; this.phone = user.phone;
    this.city = user.city;   this.zip = user.zip;
    this.isVender = user.isVender; this.user = user.user;
    this.pw = user.pw;
  }
  // set methods 
  public void setId(int id){  this.id = id; }
  public void setFirstName(String f){ this.first_name = f; }
  public void setLastName(String l){  this.last_name = l; }
  public void setEmail(String e) {  this.email = e; }
  public void setPhone(String p){this.phone = p;  }
  public void setAddr1(String a1){this.addr1 = a1;  }
  public void setAddr2(String a2){this.addr2=a2;  }
  public void setFullAddr(String addr){this.full_addr=addr; }
  public void setCity(String c){this.city = c;}
  public void setZip(String z){this.zip = z;}
  public void setState(String s){this.state = s;  }
  public void setIsVender(Boolean v){this.isVender = v; }
  public void setUser(String u){this.user = u;}
  public void setPassword(String p){this.pw = p;  }
  public void setLogin(Boolean u){this.user_loggedin = u; }
  
// getMethod 
  public int getId(){ return id;  }
  public String getFirstName(){ return first_name; }
  public String getLastName(){  return last_name; }
  public String getEmail(){ return email; }
  public String getPhone(){ return phone; }
  public String getAddr1(){ return addr1; }
  public String getAddr2(){ return addr2; }
  public String getFullAddr(){  return full_addr; }
  public String getCity(){  return city;  }
  public String getZip(){ return zip; }
  public String getState(){return state;  }
  public Boolean getIsVender(){ return isVender;  }
  public String getUser(){  return user;  }
  public Boolean getLogin(){  return user_loggedin; }
  public String getPassword(){  return pw;  }
  
  public void deleteUserSession(){
     id = 0; first_name = ""; last_name = "";
    email = ""; phone = ""; addr1 = "";
    addr2=""; full_addr=""; user_loggedin = false;
    city =""; city = ""; zip=""; state=""; user=""; pw="";
  }
}
