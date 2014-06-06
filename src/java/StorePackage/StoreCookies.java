/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StorePackage;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author ryutaromatsuda
 */
public class StoreCookies 
{
  public static String getCookieValue(Cookie[] cookies, String cookieName){
  {
    String cookieValue = null;
    Cookie cookie;
    if(cookies!=null)
    {
      for(int i=0;i<cookies.length;i++)
      {
         cookie = cookies[i];
         if(cookieName.equals(cookie.getName()))
         {
           cookieValue = cookie.getValue();
         }
      }
    }
    return cookieValue;
   }
  }
}