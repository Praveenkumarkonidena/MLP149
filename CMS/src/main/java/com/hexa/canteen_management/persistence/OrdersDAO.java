package com.hexa.canteen_management.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexa.canteen_management.model.Orders;
/**
 * OrdersDAO class used to fetch data from data base.
 * @author hexware
 */
public interface OrdersDAO {
    /**
     * @return the all the Orders record.
     */
  @SqlQuery("Select * from Orders")
    @Mapper(OrdersMapper.class)
    List<Orders> show();
}


