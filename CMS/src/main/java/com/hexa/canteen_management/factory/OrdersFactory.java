package com.hexa.canteen_management.factory; 
 
import com.hexa.canteen_management.persistence.OrdersDAO; 
import com.hexa.canteen_management.persistence.DbConnection; 
import java.util.List; 
 
import com.hexa.canteen_management.model.Orders; 
/** 
 * OrdersFactory class used to fetch Orders data from database. 
 * @author hexware 
 */ 
public class OrdersFactory { 
  /** 
   *  Protected constructor. 
   */ 
  protected OrdersFactory() { 
 
  } 
  /** 
   * Call the data base connection. 
   * @return the connection object. 
   */ 
  private static OrdersDAO dao() { 
    DbConnection db = new DbConnection(); 
    return db.getConnect().onDemand(OrdersDAO.class); 
  } 
  /** 
   * Call the data base connection. 
   * @return the array of Orders object. 
   */ 
  public static Orders[] showOrders() { 
    List<Orders> Orders = dao().show(); 
    return Orders.toArray(new Orders[Orders.size()]); 
  } 
} 