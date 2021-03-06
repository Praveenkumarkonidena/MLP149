package com.hexa.canteen_management.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexa.canteen_management.model.Vendor;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * VendorMapper class used to fetch Vendor data from database.
 * @author hexware
 */
public class VendorMapper implements ResultSetMapper<Vendor> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Vendor map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**Z
       * @return Vendor
       */
    return new Vendor(rs.getInt("V_ID"), rs.getString("V_NAME"), rs.getString("V_USERNAME"), rs.getString("V_PASSWORD"), rs.getInt("V_CONTACT"),  rs.getString("V_EMAIL"), rs.getString("V_ADDRESS"));
  }
}