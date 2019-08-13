package com.hexa.canteen_management.factory; 
 
//import com.hexa.canteen_management.persistence.EmployeeDAO; 
import com.hexa.canteen_management.persistence.*; 
import java.util.List; 
 
import com.hexa.canteen_management.model.Employee;
/** 
 * EmployeeFactory class used to fetch Employee data from database. 
 * @author hexware 
 */ 
public class EmployeeFactory { 
  /** 
   *  Protected constructor. 
   */ 
  protected EmployeeFactory() { 
 
  } 
  /** 
   * Call the data base connection. 
   * @return the connection object. 
   */ 
  private static EmployeeDAO dao() { 
    DbConnection db = new DbConnection(); 
    return db.getConnect().onDemand(EmployeeDAO.class); 
  } 
  /** 
   * Call the data base connection. 
   * @return the array of Employee object. 
   */ 
  public static Employee[] showEmployee() { 
    List<Employee> Employee = dao().show(); 
    return Employee.toArray(new Employee[Employee.size()]);
  }

  
/**
 *call the data base connection.
  @param empId for Employee Id.
  @param ePass for Employee Password.
 *@return Employee.
 */
public static Employee usrlogin(final int empId, final String ePass) {
  Employee Employee = dao().usrlogin(empId, ePass);
  return Employee;
}

public static Employee adminlogin(final int adminId, final String adminPass) {
  Employee Employee = dao().adminlogin(adminId, adminPass);
  return Employee;
}

/**
 *call the data base connection.
  @param empId for Employee Id.
 *@return Employee.
 */
public static Employee[] showempDetails(final int empId) {
  List<Employee> Employee = dao().showempDetails(empId);
  return Employee.toArray(new Employee[Employee.size()]);
}  


public static String insertData(int eid,String ename,String eusername,String epwd,int econt,int ewal,String email,String eadd){
  dao().insert(eid,ename,eusername,epwd,econt,ewal,email,eadd);
  return "Welcome To CMS";
}
  
} 