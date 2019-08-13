package com.hexa.canteen_management.model;

import java.util.Objects;

/**
 * Menuclass used to display menu information.
 * @author hexware
 */

public class Menu {
  /**
   * F_ID to store F_ID. F_NAME to store F_NAME. F_PRICE to store F_PRICE. V_ID to
   * store V_ID.    
   */
  private int F_ID;
  private String F_NAME ;
  private int F_PRICE ;
  private int V_ID  ;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
  
  public Menu(final int argF_Id){
    this.F_ID = argF_Id;
  }

  /**
   * @param argF_ID       to initialize F_ID.
   * @param argF_NAME       to initialize F_NAME.
   * @param argF_PRICE       to initialize F_PRICE.
   * @param argV_ID      to initialize V_ID.
   * used to get details through constructor.
   */
  public Menu(final int argF_ID, final String argF_NAME, final int argF_PRICE, final int argV_ID) {
    this.F_ID = argF_ID;
    this.F_NAME = argF_NAME;
    this.F_PRICE = argF_PRICE;
    this.V_ID = argV_ID;
  }

  /**
   * @return this F_ID.
   */
  public final int getF_ID() {
    return F_ID;
  }

  /**
   * @param argF_ID gets the F_ID.
   */
  public final void setF_ID(final int argF_ID) {
    this.F_ID = argF_ID;
  }

  /**
   * @return this F_NAME.
   */
  public final String getF_NAME() {
    return F_NAME;
  }

  /**
   * @param argF_NAME gets the F_NAME.
   */
  public final void setF_NAME(final String argF_NAME) {
    this.F_NAME = argF_NAME;
  }

 /**
   * @return this F_PRICE.
   */
  public final int getF_PRICE() {
    return F_PRICE;
  }

  /**
   * @param argF_PRICE gets the F_PRICE.
   */
  public final void setF_PRICE(final int argF_PRICE) {
    this.F_PRICE = argF_PRICE;
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
   * @return toString method.
   */
  public final String toString() {
    return (F_ID + " " + F_NAME + " " + F_PRICE + " " + V_ID + " " );
  }
  

  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu Menuobj = (Menu) obj;
    if (Objects.equals(Menuobj.F_ID, F_ID) && Objects.equals(Menuobj.F_NAME, F_NAME)
        && Objects.equals(Menuobj.F_PRICE, F_PRICE) && Objects.equals(Menuobj.V_ID, V_ID)) {
      return true;

    }
    return false;
  }
  /**
   * hashcode.
   */
  @Override
  public final int hashCode() {
    return Objects.hash(F_ID, F_NAME, F_PRICE, V_ID);
  }

}