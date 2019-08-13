package com.hexa.canteen_management.util;
import java.util.Scanner;
//import java.lang.*;

//import com.hexa.canteen_management.factory.MenuFactory;
import com.hexa.canteen_management.factory.*;
import com.hexa.canteen_management.model.*;
//import com.hexa.canteen_management.persistence.*;
//import com.hexa.canteen_management.model.Orders;
//import com.hexa.canteen_management.model.Vendor;

/**
 * practice used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
  private static int empId;
  private static int vId;
  private static int adminId;
  private Scanner option = new Scanner(System.in, "UTF-8");

  /**
   * mainMenu method used to display the option we had in the application.
   */
  // private void mainMenu() {
  //   System.out.println("Canteen Management System");
  //   System.out.println("-----------------------");
  //   System.out.println("1. Show Menu");
  //   System.out.println("2. Place Order");
  //   System.out.println("3. View Customer Details");
  //   System.out.println("4. View Vendor Details");
  //   System.out.println("5. Customer Order Details");
  //   System.out.println("6. Order Details");
  //   System.out.println("7. Accept or Reject");
  //   System.out.println("8. Exit");
  //   mainMenuDetails();
  // }

  // /**
  //  * mainMenuDetails method process the option selected from main menu.
  //  */
  // private void mainMenuDetails() {
  //   try {
  //     System.out.println("Enter your choice:");
  //     int menuOption = option.nextInt();
  //     switch (menuOption) {
  //       case 1:
  //         showMenu();
  //         break;
  //       case 2:
  //         placeOrder();
  //         break;
  //       case 3:
  //         viewCustomerDetails();
  //         break;
  //       case 4:
  //         viewVendorDetails();
  //         break;
  //       case 5:
  //         customerOrderDetails();
  //         break;
  //       case 6:
  //         orderDetails();
  //         break;
  //       case 7:
  //         acceptOrReject();
  //         break;
  //       case 8:
  //         exit();
  //         break;

  //       default:
  //         System.out.println("Choose from 1 to 8");
  //     }
  //   } catch (Exception e) {
  //     e.printStackTrace();
  //     System.out.println("enter a valid value");
  //   }
  //   option.nextLine();
  //   mainMenu();
  // }


  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Customer login");
    System.out.println("2. vendor login");
    System.out.println("3. Admin login");
    System.out.println("4. New User");
    System.out.println("5. Exit");
    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          empLogin();
          empMenu();
          break;
        case 2:
          //System.out.println("vendorLogin");
          vendorLogin();
          vendorMenu();
          break;
        case 3:
          //System.out.println("vendorLogin");
          adminLogin();
          adminMenu();
        case 4:
          newUser();
          mainMenu();
          break;
        case 5:
          exit();
          //Runtime.getRuntime().halt(0);
          break;
        default:
          System.out.println("Choose one valid option");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }

  private void adminMenu() {
    System.out.println("1. Show Menu");
    System.out.println("2. view  All customer Details");
    System.out.println("3. Your Order History");
    System.out.println("4. View All vendor Details");
    System.out.println("5. Exit");
    System.out.println();
    System.out.println("Enter your choice:");
    //Scanner opt = new Scanner(System.in);
    int empOption = option.nextInt();
    System.out.println();
    switch (empOption) {
      case 1:
        showMenu();
        adminMenu();
        break;
      case 2:
        //System.out.println("placeOrder");
        viewCustomerDetails();
        adminMenu();
        //empMenu();
        break;
      case 3:
        //System.out.println("OrderHistory");
        orderHistory();
        adminMenu();
        break;
      case 4:
        viewVendorDetails();
        adminMenu();
        break;
      case 5:
        mainMenu();
        break;
      default:
        System.out.println("Choose either 1,2,3,4 or 5");
        adminMenu();
    }
  
  }

  /**
 * employeeMenu method  display the employee menu.
 */
private void empMenu() {
  System.out.println("1. Show Menu");
  System.out.println("2. Place Order");
  System.out.println("3. Your Order History");
  System.out.println("4. Customer Personal Details");
  System.out.println("5. Exit");
  System.out.println();
  System.out.println("Enter your choice:");
  //Scanner opt = new Scanner(System.in);
  int empOption = option.nextInt();
  System.out.println();
  switch (empOption) {
    case 1:
      showMenu();
      empMenu();
      break;
    case 2:
      //System.out.println("placeOrder");
      placeOrder();
      //empMenu();
      break;
    case 3:
      //System.out.println("OrderHistory");
      orderHistory();
      empMenu();
      break;
    case 4:
      showempDetails();
      empMenu();
      break;
    case 5:
      mainMenu();
      break;
    default:
      System.out.println("Choose either 1,2,3,4 or 5");
      empMenu();
  }

}

/**
 * vendorMenu method  display the vendor menu.
*/
private void vendorMenu() {
  System.out.println("1. Order Accept or Reject");
  System.out.println("2. Vendor History");
  System.out.println("3. Vendor Personal Details");
  System.out.println("4. Exit");
  System.out.println();
  System.out.println("Enter your choice:");
  int vendorOption = option.nextInt();
  System.out.println();
  switch (vendorOption) {
    case 1:
      //System.out.println("acceptRejectOrder");
      acceptOrReject();
      vendorMenu();
      break;
    case 2:
      //System.out.println("vendorHistory");
      orderHistory();
      vendorMenu();
      break;
    case 3:
      //System.out.println("vendorDetails");
      showVendorDetails();
      vendorMenu();
      break;
    case 4:
      mainMenu();
      break;
    default:
      System.out.println("Choose valid option");
      vendorMenu();
  }
}


private void newUser(){
    System.out.println("Enter the employee id");
    int eid=option.nextInt();
    System.out.println("Enter the employee name:");
    String ename=option.next();
    System.out.println("Enter the employee username:");
    String eusername=option.next();
    System.out.println("Enter the employee password:");
    String epwd=option.next();
    System.out.println("Enter the employee Contact:");
    int econt=option.nextInt();
    System.out.println("Enter the employee wallet balance:");
    int ewal=option.nextInt();
    System.out.println("Enter the employee Email Id:");
    String email=option.next();
    System.out.println("Enter the employee Address:");
    String eadd=option.next();
    System.out.println("\n");
  String value=EmployeeFactory.insertData(eid,ename,eusername,epwd,econt,ewal,email,eadd );
  System.out.println("The value is:"+value+"\n");
  System.out.println("Your Details are ==>");
  System.out.printf(eid+"  "+ ename+"  "+ eusername +"  "+epwd +"  " +econt + "  " + ewal+"  " + email+"  "+ eadd );

}





  /**
   * showFullMenu method display the menu item stored in database.
   */
  private void showMenu() {
     Menu[] menu = MenuFactory.showMenu();
      System.out.println("-----------------------------------------------------------------------------");
      System.out.printf("%10s %30s %20s ", "Menu_Id", "Item_Name", "Price");
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------");
     // System.out.println("Menu_Id          Item_Name \n");
     for (Menu m : menu) {
       //System.out.println(m.getF_ID() + "    ---->     "+ m.getF_NAME());
       System.out.format("%10s %30s %20s",m.getF_ID(), m.getF_NAME(), m.getF_PRICE());
       System.out.println();
    }
    System.out.println("-----------------------------------------------------------------------------");
  }
  

  /**
   * placing order.
   */
  private void placeOrder() {
    System.out.println("Place your order");
  }

  /**
   * viewing customer details.
   * this is for admin
   */
  private void viewCustomerDetails() {
   
     Employee[] employee = EmployeeFactory.showEmployee();
     System.out.println("CUSTOMER_ DETAILS");
     System.out.println("-----------------------------------------------------------------------------");
     System.out.printf("%20s %30s %30s %20s %30s", "CUSTOMER_ID", "CUSTOMER_NAME", "CUSTOMER_CONTACT" ,"WALLET_BALANCE", "CUSTOMER_EMAIL");
     System.out.println();
     System.out.println("-----------------------------------------------------------------------------");
     // System.out.println("CUSTOMER_ID       CUSTOMER_NAME       CUSTOMER_CONTACT        WALLET_BALANCE     CUSTOMER_EMAIL");
     for (Employee e : employee) {
       System.out.format("%20s %30s %30s %20s %30s",e.getEMP_ID(),e.getEMP_NAME(),e.getEMP_CONTACT(),e.getWALLET_BAL(),e.getEMP_EMAIL());
       System.out.println();
      }
      System.out.println("-----------------------------------------------------------------------------");
}




  /**
   * viewing vendor details. 
   * this is for admin
   */
  private void viewVendorDetails() {
     Vendor[] vendor = VendorFactory.showVendor();
     System.out.println("VENDOR_ DETAILS");
     System.out.println("-----------------------------------------------------------------------------");
     System.out.printf("%20s %30s %30s %30s", "VENDOR_ID", "VENDOR_NAME", "VENDOR_CONTACT" ,"VENDOR_EMAIL" );
     System.out.println();
     System.out.println("-----------------------------------------------------------------------------");
     //System.out.println("VENDOR_ID       VENDOR_NAME       VENDOR_CONTACT          VENDOR_EMAIL ");
    for (Vendor v : vendor) {
       System.out.format("%20s %30s %30s %30s",v.getV_ID(),v.getV_NAME() ,v.getV_CONTACT(),v.getV_EMAIL());
       System.out.println();
  }
  System.out.println("-----------------------------------------------------------------------------");
}


  /**
 * customerDetails method  display the customer Information.
 */
private void showempDetails() {
  Employee[] employee = EmployeeFactory.showempDetails(empId);
  System.out.println("Customer Details");
  System.out.println("-----------------------------------------------------------------------------");
  System.out.printf("%10s %10s %10s %10s %10s %10s", "ID","Name","PhoneNo","Email","WalletBalance","Address");
  System.out.println();
  System.out.println("-----------------------------------------------------------------------------");
  for (Employee e : employee) {
    System.out.format("%10s %10s %10s %10s %10s %10s",e.getEMP_ID(),e.getEMP_NAME(),e.getEMP_CONTACT(),e.getEMP_EMAIL(),e.getWALLET_BAL(),e.getEMP_ADDRESS());
    System.out.println();
  }
  System.out.println("-----------------------------------------------------------------------------");
}

private void showVendorDetails(){
  Vendor[] vendor = VendorFactory.showvendorDetails(vId);
  System.out.println("Vendor Details");
  System.out.println("-----------------------------------------------------------------------------");
  System.out.printf("%10s %10s %10s %10s %10s", "ID","Name","PhoneNo","Email","Address");
  //System.out.println("ID          Name             PhoneNo             Email             Address");
  System.out.println();
  System.out.println("-----------------------------------------------------------------------------");
  for (Vendor v : vendor) {
    System.out.format("%10s %10s %10s %10s %10s",v.getV_ID(),v.getV_NAME(),v.getV_CONTACT(),v.getV_EMAIL(),v.getV_ADDRESS());
    System.out.println();
  }
  System.out.println("-----------------------------------------------------------------------------");
}


  // /**
  //  * customer details.
  //  */
  // private void customerOrderDetails() {
  //    Orders[] orders = OrdersFactory.showOrders();
  //    System.out.println("ORDER_HISTORY");
  //    System.out.println("ORDER_ID   EMP_ID  FOOD_ID   VENDOR_ID   ORDER_STATUS       ORDER_DATE              ORDER_QUAN             TOTAL_AMT         ESTIMATED_TIME");
  //    for (Orders o : orders) {
  //      System.out.println(o.getO_ID() + "           " + o.getEMP_ID() + "      " + o.getF_ID() + "      " + o.getV_ID()
  //          + "       " + o.getO_STATUS() + "        " + o.getO_DATE() + "     " + o.getO_QUANTITY() + "    " + o.getTOTAL_AMT()
  //          + "         " + o.getESTIMATED_TIME());
  //     /*System.out.println(" EMPD_ID : " + o.getEMP_ID());
  //     System.out.println(" FOOD_ID : " + o.getF_ID());
  //     System.out.println(" VENDOR_ID : " + o.getV_ID());
  //     System.out.println(" ORDER_STATUS : " + o.getO_STATUS());
  //     System.out.println(" ORDER_DATE : " + o.getO_DATE());
  //     System.out.println(" ORDER_QUAN : " + o.getO_QUANTITY());
  //     System.out.println(" TOTAL_AMT : " + o.getTOTAL_AMT());
  //     System.out.println(" ESTIMATED_TIME : " + o.getESTIMATED_TIME());*/
  //   }
  // }
  

  /**
   * order details.
   */
  private void orderHistory() {
    System.out.println("your order history is here");

    //  Orders[] orders = OrdersFactory.showOrders();
    //  System.out.println("VENDOR_ORDER_HISTORY");
    //  System.out.println("ORDER_ID       EMP_ID       VENDOR_ID          FOOD_ID       ORDER_STATUS");
    //  for (Orders v : orders) {
    //    System.out.println(v.getO_ID() + "              " + v.getEMP_ID() + "            "
    //        + v.getV_ID() + "            " + v.getF_ID() + "            " + v.getO_STATUS());


      /*System.out.println(" EMP_ID : " + v.getEMP_ID());
      System.out.println(" VENDOR_ID : " + v.getV_ID());
      System.out.println(" FOOD_ID : " + v.getF_ID());
      System.out.println(" ORDER_STATUS : " + v.getO_STATUS());*/
    }
  
  

  /**
   * order accepted or rejected.
   */
  private void acceptOrReject() {
    System.out.println("acceptorreject orders will be done here");
  }

  /**
   * logout.
   */
  private void exit() {    
    Runtime.getRuntime().halt(0);
  }


  /**
   * empLogin method  display the menu item stored in database.
   */
private void empLogin() {
  System.out.println("Hello..Please Login Here...! \n");
  //System.out.println();
  String ePass;
  //Scanner input1 = new Scanner(System.in);
  //System.out.println();
  System.out.println("Customer ID : ");
  empId = option.nextInt();
  System.out.println("Password : ");
  ePass = option.next();
  Employee employee = EmployeeFactory.usrlogin(empId, ePass);
  try {
    if (employee.getEMP_ID() == (empId) && employee.getEMP_PASSWORD().equals(ePass)) {
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------");
      System.out.format("%30S ","your access was granted : \n");
      System.out.println("-----------------------------------------------------------------------------");
      System.out.println();
    }
  } catch (Exception e) {
    System.out.println("invalid credentials!!!");
    empLogin();
  }
}

private void adminLogin() {
  String adminPass;
  //Scanner input1 = new Scanner(System.in);
  System.out.println();
  System.out.println("Admin ID : ");
  adminId = option.nextInt();
  System.out.println("Password : ");
  adminPass = option.next();
  Employee employee1 = EmployeeFactory.adminlogin(adminId, adminPass);
  try {
    if (employee1.getEMP_ID() == (adminId) && employee1.getEMP_PASSWORD().equals(adminPass)) {
      System.out.println();
      System.out.println("-----------------------------------------------------------------------------");
      System.out.format("%30S ","your access was granted : \n");
      System.out.println("-----------------------------------------------------------------------------");
      System.out.println();
    }
    else{
      System.out.println("ReEnter Your Details");
      adminLogin();
    }
  } catch (Exception e) {
    System.out.println("invalid credentials!!!");
    adminLogin();
  }
}



private void vendorLogin() {
  String vPass;
  //Scanner input1 = new Scanner(System.in);
  System.out.println("Vendor ID : ");
  vId = option.nextInt();
  System.out.println("Password : ");
  vPass = option.next();
  Vendor vendor = VendorFactory.vlogin(vId, vPass);
  try {
    if (vendor.getV_ID() == (vId) && vendor.getV_PASSWORD().equals(vPass)) {
      System.out.println("your access was granted :");
    }
  } catch (Exception e) {
    System.out.println("invalid credentials!!!");
    vendorLogin();
  }
}




/**

  /**
   * main method is the basic entry point for the application.
   * @param args used to get the user input.
   */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
