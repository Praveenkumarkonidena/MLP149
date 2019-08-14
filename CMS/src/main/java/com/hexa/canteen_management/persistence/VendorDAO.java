package com.hexa.canteen_management.persistence;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexa.canteen_management.model.Vendor;
/**
 * VendorDAO class used to fetch data from data base.
 * @author hexware
 */
public interface VendorDAO {
    /**
     * @return the all the Vendor record.
     */
  @SqlQuery("Select * from Vendor")
    @Mapper(VendorMapper.class)
    List<Vendor> show();

    /**
 *@return the Vendor id and password.
 *@param cusId Vendor id.
 *@param cPass Vendor password.
 */
  @SqlQuery("SELECT * FROM Vendor where V_ID =:V_ID AND V_PASSWORD =:V_PASSWORD")
  @Mapper(VendorMapper.class)
  Vendor vlogin(@Bind("V_ID") int vId, @Bind("V_PASSWORD") String vPass);
/**
 * @return specific Vendor details.
 * @param vId parameter.
 */
  @SqlQuery("Select * from Vendor WHERE V_ID=:V_ID")
  @Mapper(VendorMapper.class)
  List<Vendor> showvendorDetails(@Bind("V_ID")int vId);
}