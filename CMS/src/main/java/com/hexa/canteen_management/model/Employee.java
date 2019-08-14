package com.hexa.canteen_management.model;

import java.util.Objects;

/**
 * Employeeclass used to display Employee information.
 * @author hexware
 */

public class Employee {
  /**
   * EMP_ID to store EMP_ID. EMP_NAME  to store EMP_NAME . EMP_USERNAME  to store EMP_USERNAME . EMP_PASSWORD to
   * store EMP_PASSWORD. EMP_CONTACT to store EMP_CONTACT. WALLET_BAL to store WALLET_BAL. EMP_ADDRESS to store EMP_ADDRESS.
   * EMP_ADDRESS to store EMP_ADDRESS.
   */
  private int EMP_ID;
  private String EMP_NAME;
  private String EMP_USERNAME;
  private String EMP_PASSWORD;
  private int EMP_CONTACT;
  private int WALLET_BAL;
  private String EMP_EMAIL;
  private String EMP_ADDRESS;
  /**
   * Default Constructor.
   */
  public Employee() {

  }

  /**
   * @param argEMP_ID       to initialize EMP_ID.
   * @param argEMP_NAME        to initialize EMP_NAME .
   * @param argEMP_USERNAME        to initialize EMP_USERNAME .
   * @param argEMP_PASSWORD      to initialize EMP_PASSWORD.
   * @param argEMP_CONTACT      to initialize EMP_CONTACT.
   * @param argWALLET_BAL      to initialize WALLET_BAL.
   * @param argEMP_EMAIL      to initialize EMP_EMAIL.
   * @param argEMP_ADDRESS      to initialize EMP_ADDRESS.
   * used to get details through constructor.
   */

    public Employee(final int argEMP_ID){
    this.EMP_ID = argEMP_ID;
  }  

  public Employee(final int argEMP_ID, final String argEMP_NAME , final String argEMP_USERNAME , final String argEMP_PASSWORD, final int argEMP_CONTACT, final int argWALLET_BAL, final String argEMP_ADDRESS, final String argEMP_EMAIL) {
    this.EMP_ID = argEMP_ID;
    this.EMP_NAME  = argEMP_NAME ;
    this.EMP_USERNAME  = argEMP_USERNAME ;
    this.EMP_PASSWORD = argEMP_PASSWORD;
    this.EMP_CONTACT = argEMP_CONTACT;
    this.WALLET_BAL = argWALLET_BAL;
    this.EMP_EMAIL = argEMP_EMAIL;
    this.EMP_ADDRESS = argEMP_ADDRESS;
  }

  /**
   * @return this EMP_ID.
   */
  public final int getEMP_ID() {
    return EMP_ID;
  }

  /**
   * @param argEMP_ID gets the EMP_ID.
   */
  public final void setEMP_ID(final int argEMP_ID) {
    this.EMP_ID = argEMP_ID;
  }

  /**
   * @return this EMP_NAME .
   */
  public final String getEMP_NAME () {
    return EMP_NAME ;
  }

  /**
   * @param argEMP_NAME  gets the EMP_NAME .
   */
  public final void setEMP_NAME (final String argEMP_NAME ) {
    this.EMP_NAME = argEMP_NAME;
  }

 /**
   * @return this EMP_USERNAME .
   */
  public final String getEMP_USERNAME () {
    return EMP_USERNAME ;
  }

  /**
   * @param argEMP_USERNAME  gets the EMP_USERNAME .
   */
  public final void setEMP_USERNAME (final String argEMP_USERNAME ) {
    this.EMP_USERNAME  = argEMP_USERNAME ;
  }

  /**
   * @return this EMP_PASSWORD.
   */
  public final String getEMP_PASSWORD() {
    return EMP_PASSWORD;
  }

  /**
   * @param argEMP_PASSWORD gets the EMP_PASSWORD.
   */
  public final void setEMP_PASSWORD(final String argEMP_PASSWORD) {
    this.EMP_PASSWORD = argEMP_PASSWORD;
  }
  
  /**
   * @return this EMP_CONTACT.
   */
  public final int getEMP_CONTACT() {
    return EMP_CONTACT;
  }

  /**
   * @param argEMP_CONTACT gets the EMP_CONTACT.
   */
  public final void setEMP_CONTACT(final int argEMP_CONTACT) {
    this.EMP_CONTACT = argEMP_CONTACT;
  }
  
    /**
   * @return this WALLET_BAL.
   */
  public final int getWALLET_BAL() {
    return WALLET_BAL;
  }

  /**
   * @param argWALLET_BAL gets the WALLET_BAL.
   */
  public final void setWALLET_BAL(final int argWALLET_BAL) {
    this.WALLET_BAL = argWALLET_BAL;
  }
  
  /**
   * @return this EMP_EMAIL.
   */
  public final String getEMP_EMAIL() {
    return EMP_EMAIL;
  }

  /**
   * @param argEMP_EMAIL gets the EMP_EMAIL.
   */
  public final void setEMP_EMAIL(final String argEMP_EMAIL) {
    this.EMP_EMAIL = argEMP_EMAIL;
  }


  /**
   * @return this EMP_ADDRESS.
   */
  public final String getEMP_ADDRESS() {
    return EMP_ADDRESS;
  }

  /**
   * @param argEMP_ADDRESS gets the EMP_ADDRESS.
   */
  public final void setEMP_ADDRESS(final String argEMP_ADDRESS) {
    this.EMP_ADDRESS = argEMP_ADDRESS;
  }

  /**
   * @return toString method.
   */
  public final String toString() {
    return (EMP_ID + " " + EMP_NAME  + " " + EMP_USERNAME  + " " + EMP_PASSWORD + " " + EMP_CONTACT + " " + WALLET_BAL + " " + EMP_ADDRESS + " "+ EMP_EMAIL + " "  );
  }
  
  @Override
  public final boolean equals(final Object obj) {
      if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee Employeeobj = (Employee) obj;
    if (Objects.equals(Employeeobj.EMP_ID, EMP_ID) && Objects.equals(Employeeobj.EMP_NAME , EMP_NAME )
        && Objects.equals(Employeeobj.EMP_USERNAME , EMP_USERNAME ) && Objects.equals(Employeeobj.EMP_PASSWORD, EMP_PASSWORD)
        && Objects.equals(Employeeobj.EMP_CONTACT, EMP_CONTACT) && Objects.equals(Employeeobj.WALLET_BAL, WALLET_BAL)
        && Objects.equals(Employeeobj.EMP_EMAIL, EMP_EMAIL)&& Objects.equals(Employeeobj.EMP_ADDRESS, EMP_ADDRESS)) {
      return true;

    }
    return false;
  }

  /**
   * hashcode.
   */
  @Override
  public final int hashCode() {
    return Objects.hash(EMP_ID, EMP_NAME , EMP_USERNAME , EMP_PASSWORD, EMP_CONTACT, WALLET_BAL, EMP_EMAIL, EMP_ADDRESS);
  }

}