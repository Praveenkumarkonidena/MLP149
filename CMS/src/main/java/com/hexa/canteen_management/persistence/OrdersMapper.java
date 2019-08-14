package com.hexa.canteen_management.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.hexa.canteen_management.model.Orders;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
//import java.time.*;
//import java.sql.Time;;
/**
 * OrdersMapper class used to fetch Orders data from database.
 * @author hexware
 */
public class OrdersMapper implements ResultSetMapper<Orders> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Orders map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Orders
       */
    return new Orders(rs.getInt("O_ID"), rs.getInt("EMP_ID"), rs.getInt("F_ID"), rs.getInt("V_ID"),
    rs.getString("O_STATUS"), rs.getDate("O_DATE"), rs.getInt("O_QUANTITY"), rs.getInt("TOTAL_AMT"),
    rs.getDate("ESTIMATED_TIME"), rs.getTime("CANCEL_TIME"));
  }
}