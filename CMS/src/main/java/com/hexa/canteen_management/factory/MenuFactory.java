package com.hexa.canteen_management.factory; 
 
import com.hexa.canteen_management.persistence.MenuDAO; 
import com.hexa.canteen_management.persistence.DbConnection; 
import java.util.List; 
 
import com.hexa.canteen_management.model.Menu; 
/** 
 * MenuFactory class used to fetch Menu data from database. 
 * @author hexware 
 */ 
public class MenuFactory { 
  /** 
   *  Protected constructor. 
   */ 
  protected MenuFactory() { 
 
  } 
  /** 
   * Call the data base connection. 
   * @return the connection object. 
   */ 
  private static MenuDAO dao() { 
    DbConnection db = new DbConnection(); 
    return db.getConnect().onDemand(MenuDAO.class); 
  } 
  /** 
   * Call the data base connection. 
   * @return the array of Menu object. 
   */ 
  public static Menu[] showMenu() { 
    List<Menu> Menu = dao().show(); 
    return Menu.toArray(new Menu[Menu.size()]); 
  } 
} 