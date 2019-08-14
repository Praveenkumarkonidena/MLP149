package com.hexa.canteen_management.factory; 
 
import com.hexa.canteen_management.persistence.VendorDAO; 
import com.hexa.canteen_management.persistence.DbConnection; 
import java.util.List; 
 
import com.hexa.canteen_management.model.Vendor; 
/** 
 * VendorFactory class used to fetch Vendor data from database. 
 * @author hexware 
 */ 
public class VendorFactory { 
  /** 
   *  Protected constructor. 
   */ 
  protected VendorFactory() { 
 
  } 
  /** 
   * Call the data base connection. 
   * @return the connection object. 
   */ 
  private static VendorDAO dao() { 
    DbConnection db = new DbConnection(); 
    return db.getConnect().onDemand(VendorDAO.class); 
  } 
  /** 
   * Call the data base connection. 
   * @return the array of Vendor object. 
   */ 
  public static Vendor[] showVendor() { 
    List<Vendor> Vendor = dao().show(); 
    return Vendor.toArray(new Vendor[Vendor.size()]); 
  } 

  
/**
 *call the data base connection.
  @param vId for Vendor Id.
  @param vPass for Vendor Password.
 *@return Vendor.
 */
public static Vendor vlogin(final int vId, final String vPass) {
  Vendor Vendor = dao().vlogin(vId, vPass);
  return Vendor;
}
/**
 *call the data base connection.
  @param vId for Vendor Id.
 *@return Vendor.
 */
public static Vendor[] showvendorDetails(final int vId) {
  List<Vendor> Vendor = dao().showvendorDetails(vId);
  return Vendor.toArray(new Vendor[Vendor.size()]);
}  

} 