package com.hexa.canteen_management.persistence;
import com.hexa.canteen_management.model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * EmployeeMapper class used to fetch Employee data from database.
 * @author hexware
 */
public class EmployeeMapper implements ResultSetMapper<Employee> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Employee map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**Z
       * @return Employee
       */
      // Type columns names of table
    return new Employee(rs.getInt("EMP_ID"), rs.getString("EMP_NAME"), rs.getString("EMP_USERNAME"), rs.getString("EMP_PASSWORD"), rs.getInt("EMP_CONTACT"),
    rs.getInt("WALLET_BAL"), rs.getString("EMP_EMAIL"), rs.getString("EMP_ADDRESS"));
  }
}