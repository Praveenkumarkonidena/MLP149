package com.hexa.training.persistence;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexa.training.model.*;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * MenuMapper class used to fetch menu data from database.
 * @author hexware
 */
public class TrainingMapper implements ResultSetMapper<Training> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Training map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Menu
       */
    return new Training(rs.getInt("tid"),rs.getString("training_name"));
  }
}