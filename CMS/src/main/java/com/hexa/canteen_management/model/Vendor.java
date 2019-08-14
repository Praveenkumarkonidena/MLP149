package com.hexa.canteen_management.model;

import java.util.Objects;

/**
 * Vendorclass used to display Vendor information.
 * @author hexware
 */

public class Vendor {
  /**
   * V_ID to store V_ID. V_NAME to store V_NAME. V_USERNAME to store V_USERNAME. V_PASSWORD to
   * store V_PASSWORD. V_CONTACT to store V_CONTACT. V_EMAIL to store V_EMAIL. V_ADDRESS to store V_ADDRESS
   */
  private int V_ID;
  private String V_NAME;
  private String V_USERNAME;
  private String V_PASSWORD;
  private int V_CONTACT;
  private String V_EMAIL;
  private String V_ADDRESS;
  /**
   * Default Constructor.
   */
  public Vendor() {

  }

  /**
   * @param argV_ID       to initialize V_ID.
   * @param argV_NAME       to initialize V_NAME.
   * @param argV_USERNAME       to initialize V_USERNAME.
   * @param argV_PASSWORD      to initialize V_PASSWORD.
   *@param argV_CONTACT      to initialize V_CONTACT.
   *@param argV_EMAIL      to initialize V_EMAIL.
   *@param argV_ADDRESS      to initialize V_ADDRESS.
   * used to get details through constructor.
   */

    public Vendor(final int argV_ID){
    this.V_ID = argV_ID;
  }  

  public Vendor(final int argV_ID, final String argV_NAME, final String argV_USERNAME, final String argV_PASSWORD, final int argV_CONTACT, final String argV_EMAIL, final String argV_ADDRESS) {
    this.V_ID = argV_ID;
    this.V_NAME = argV_NAME;
    this.V_USERNAME = argV_USERNAME;
    this.V_PASSWORD = argV_PASSWORD;
    this.V_CONTACT = argV_CONTACT;
    this.V_EMAIL = argV_EMAIL;
    this.V_ADDRESS = argV_ADDRESS;
  }

  /**
   * @return this V_ID.
   */
  public final int getV_ID() {
    return V_ID;
  }

  /**
   * @param argV_ID gets the V_ID.
   */
  public final void setV_ID(final int argV_ID) {
    this.V_ID = argV_ID;
  }

  /**
   * @return this V_NAME.
   */
  public final String getV_NAME() {
    return V_NAME;
  }

  /**
   * @param argV_NAME gets the V_NAME.
   */
  public final void setV_NAME(final String argV_NAME) {
    this.V_NAME = argV_NAME;
  }

 /**
   * @return this V_USERNAME.
   */
  public final String getV_USERNAME() {
    return V_USERNAME;
  }

  /**
   * @param argV_USERNAME gets the V_USERNAME.
   */
  public final void setV_USERNAME(final String argV_USERNAME) {
    this.V_USERNAME = argV_USERNAME;
  }

  /**
   * @return this V_PASSWORD.
   */
  public final String getV_PASSWORD() {
    return V_PASSWORD;
  }

  /**
   * @param argV_PASSWORD gets the V_PASSWORD.
   */
  public final void setV_PASSWORD(final String argV_PASSWORD) {
    this.V_PASSWORD = argV_PASSWORD;
  }
  
  /**
   * @return this V_CONTACT.
   */
  public final int getV_CONTACT() {
    return V_CONTACT;
  }

  /**
   * @param argV_CONTACT gets the V_CONTACT.
   */
  public final void setV_CONTACT(final int argV_CONTACT) {
    this.V_CONTACT = argV_CONTACT;
  }
  
    /**
   * @return this V_EMAIL.
   */
  public final String getV_EMAIL() {
    return V_EMAIL;
  }

  /**
   * @param argV_EMAIL gets the V_EMAIL.
   */
  public final void setV_EMAIL(final String argV_EMAIL) {
    this.V_EMAIL = argV_EMAIL;
  }
  
   /**
   * @return this V_ADDRESS.
   */
  public final String getV_ADDRESS() {
    return V_ADDRESS;
  }

  /**
   * @param argV_ADDRESS gets the V_ADDRESS.
   */
  public final void setV_ADDRESS(final String argV_ADDRESS) {
    this.V_ADDRESS = argV_ADDRESS;
  }

  /**
   * @return toString method.
   */
  public final String toString() {
    return (V_ID + " " + V_NAME + " " + V_USERNAME + " " + V_PASSWORD + " " + V_CONTACT + " " + V_EMAIL + " " + V_ADDRESS + " " );
  }
  
  @Override
  public final boolean equals(final Object obj) {
      if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Vendor Vendorobj = (Vendor) obj;
    if (Objects.equals(Vendorobj.V_ID, V_ID) && Objects.equals(Vendorobj.V_NAME, V_NAME)
        && Objects.equals(Vendorobj.V_USERNAME, V_USERNAME) && Objects.equals(Vendorobj.V_PASSWORD, V_PASSWORD)
        && Objects.equals(Vendorobj.V_CONTACT, V_CONTACT) && Objects.equals(Vendorobj.V_EMAIL, V_EMAIL)
        && Objects.equals(Vendorobj.V_ADDRESS, V_ADDRESS)) {
      return true;

    }
    return false;
  }
  /**
   * hashcode.
   */
  @Override
  public final int hashCode() {
    return Objects.hash(V_ID, V_NAME, V_USERNAME, V_PASSWORD, V_CONTACT, V_EMAIL, V_ADDRESS);
  }

}