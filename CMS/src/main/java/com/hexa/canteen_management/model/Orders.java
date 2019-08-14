package com.hexa.canteen_management.model;
import java.util.Objects;
import java.sql.Date;
import java.sql.Time;
//import java.sql.Time;
//import java.time.*;
//import java.util.*;
//import java.lang.*;

/**
 * Ordersclass used to display menu information.
 * @author hexware
 */

public class Orders {
  /**
   * O_ID to store O_ID. F_ID to store F_ID. EMP_ID to store EMP_ID. V_ID to
   * store V_ID. O_STATUS to store O_STATUS. O_DATE to store O_DATE.
   * O_QUANTITY to store O_QUANTITY. TOTAL_AMT to store TOTAL_AMT. ESTIMATED_TIME to
   * store ESTIMATED_TIME. CANCEL_TIME to store CANCEL_TIME.
   */
  private int O_ID;
  private int F_ID;
  private int EMP_ID;
  private int V_ID;
  private String O_STATUS;
  private Date O_DATE;
  private int O_QUANTITY;
  private int TOTAL_AMT;
  private Date ESTIMATED_TIME;
  private Time CANCEL_TIME;

  /**
   * Default Constructor.
   */
  public Orders() {

  }

  public Orders(final int argO_Id){
    this.O_ID = argO_Id;
  }

  /**
   * @param argO_ID       to initialize O_ID.
   * @param argF_ID       to initialize F_ID.
   * @param argEMP_ID       to initialize EMP_ID.
   * @param argV_ID      to initialize V_ID.
   * @param argO_STATUS to initialize O_STATUS.
   * @param argO_DATE     to initialize O_DATE.
   * @param argO_QUANTITY to initialize O_QUANTITY.
   * @param argTOTAL_AMT   to initialize TOTAL_AMT.
   * @param argESTIMATED_TIME    to initialize ESTIMATED_TIME.
   * @param argCANCEL_TIME   to initialize CANCEL_TIME.
   * used to get details through constructor.
   */
  public Orders(final int argO_ID, final int argF_ID, final int argEMP_ID, final int argV_ID, final String argO_STATUS,
      final Date argO_DATE, final int argO_QUANTITY, final int argTOTAL_AMT, final Date argESTIMATED_TIME,
      final Time argCANCEL_TIME) {
    this.O_ID = argO_ID;
    this.F_ID = argF_ID;
    this.EMP_ID = argEMP_ID;
    this.V_ID = argV_ID;
    this.O_STATUS = argO_STATUS;
    this.O_DATE = argO_DATE;
    this.O_QUANTITY = argO_QUANTITY;
    this.TOTAL_AMT = argTOTAL_AMT;
    this.ESTIMATED_TIME = argESTIMATED_TIME;
    this.CANCEL_TIME = argCANCEL_TIME;
  }

  /**
   * @return this O_ID.
   */
  public final int getO_ID() {
    return O_ID;
  }

  /**
   * @param argO_ID gets the O_ID.
   */
  public final void setO_ID(final int argO_ID) {
    this.O_ID = argO_ID;
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
   * @return this O_STATUS.
   */
  public final String getO_STATUS() {
    return O_STATUS;
  }

  /**
   * @param argO_STATUS gets the O_STATUS.
   */
  public final void setO_STATUS(final String argO_STATUS) {
    this.O_STATUS = argO_STATUS;
  }

  /**
   * @return this O_DATE.
   */
  public final Date getO_DATE() {
    return O_DATE;
  }

  /**
   * @param argO_DATE gets the O_DATE.
   */
  public final void setO_DATE(final Date argO_DATE) {
    this.O_DATE = argO_DATE;
  }

  /**
   * @return this O_QUANTITY.
   */
  public final int getO_QUANTITY() {
    return O_QUANTITY;
  }

  /**
   * @param argO_QUANTITY gets the O_DATE.
   */
  public final void setO_QUANTITY(final int argO_QUANTITY) {
    this.O_QUANTITY = argO_QUANTITY;
  }

  /**
   * @return this TOTAL_AMT.
   */
  public final int getTOTAL_AMT() {
    return TOTAL_AMT;
  }

  /**
   * @param argTOTAL_AMT gets the TOTAL_AMT.
   */
  public final void setTOTAL_AMT(final int argTOTAL_AMT) {
    this.TOTAL_AMT = argTOTAL_AMT;
  }

  /**
   * @return this ESTIMATED_TIME.
   */
  public final Date getESTIMATED_TIME() {
    return ESTIMATED_TIME;
  }

  /**
   * @param argESTIMATED_TIME gets the ESTIMATED_TIME.
   */
  public final void setESTIMATED_TIME(final Date argESTIMATED_TIME) {
    this.ESTIMATED_TIME = argESTIMATED_TIME;
  }

  /**
   * @return this CANCEL_TIME.
   */
  public final Time getCANCEL_TIME() {
    return CANCEL_TIME;
  }

  /**
   * @param argCANCEL_TIME gets the CANCEL_TIME.
   */
  public final void setCANCEL_TIME(final Time argCANCEL_TIME) {
    this.CANCEL_TIME = argCANCEL_TIME;
  }
  /**
   * @return toString method.
   */
  public final String toString() {
    return (O_ID + " " + F_ID + " " + EMP_ID + " " + V_ID + " " + O_STATUS + " " + O_DATE + " " + O_QUANTITY + " "
        + TOTAL_AMT + " " + ESTIMATED_TIME + " " + CANCEL_TIME);

  }
  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Orders ordersobj = (Orders) obj;
    if (Objects.equals(ordersobj.O_ID, O_ID) && Objects.equals(ordersobj.F_ID, F_ID)
        && Objects.equals(ordersobj.EMP_ID, EMP_ID) && Objects.equals(ordersobj.V_ID, V_ID)
        && Objects.equals(ordersobj.O_STATUS, O_STATUS) && Objects.equals(ordersobj.O_DATE, O_DATE)
        && Objects.equals(ordersobj.O_QUANTITY, O_QUANTITY) && Objects.equals(ordersobj.TOTAL_AMT, TOTAL_AMT)
        && Objects.equals(ordersobj.ESTIMATED_TIME, ESTIMATED_TIME) && Objects.equals(ordersobj.CANCEL_TIME, CANCEL_TIME)) {
      return true;
    }
    return false;
  }
  /**
   * hashcode.
   */
  @Override
  public final int hashCode() {
    return Objects.hash(O_ID, F_ID, EMP_ID, V_ID, O_STATUS, O_DATE, O_QUANTITY, TOTAL_AMT, ESTIMATED_TIME, CANCEL_TIME);
  }

}