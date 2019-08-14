package com.hexa.canteen_management.persistence;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexa.canteen_management.model.Employee;
/**
 * EmployeeDAO class used to fetch data from data base.
 * @author hexware
 */
public interface EmployeeDAO {
    /**
     * @return the all the Employee record.
     */
  @SqlQuery("Select * from Employee")
    @Mapper(EmployeeMapper.class)
    List<Employee> show();

    /**
 *@return the Employee id and password.
 *@param cusId Employee id.
 *@param cPass Employee password.
 */
  @SqlQuery("SELECT * FROM Employee where EMP_ID =:EMP_ID AND EMP_PASSWORD =:EMP_PASSWORD")
  @Mapper(EmployeeMapper.class)
  Employee usrlogin(@Bind("EMP_ID") int empId, @Bind("EMP_PASSWORD") String ePass);

    /**
 *@return the Employee id and password.
 *@param 201 Employee id.
 *@param CHANDAN@123! Employee password.
 */

  @SqlQuery("SELECT * FROM Employee where EMP_ID ='207' AND EMP_PASSWORD ='praveen123'")
  @Mapper(EmployeeMapper.class)
  Employee adminlogin(@Bind("EMP_ID") int adminId, @Bind("EMP_PASSWORD") String adminPass);
/**
 * @return specific Employee details.
 * @param cusId parameter.
 */
  @SqlQuery("Select * from Employee WHERE EMP_ID=:EMP_ID")
  @Mapper(EmployeeMapper.class)
  List<Employee> showempDetails(@Bind("EMP_ID")int empId);


  @SqlUpdate("insert into Employee values(:EMP_ID,:EMP_NAME,:EMP_USERNAME,:EMP_PASSWORD,:EMP_CONTACT,:WALLET_BAL,:EMP_EMAIL,:EMP_ADDRESS)")
    @Mapper(EmployeeMapper.class)
    void insert(@Bind("EMP_ID")int eid,@Bind("EMP_NAME") String ename,@Bind("EMP_USERNAME") String eusername,@Bind("EMP_PASSWORD") String epwd,
    @Bind("EMP_CONTACT") int econt,@Bind("WALLET_BAL") int ewal,@Bind("EMP_EMAIL") String email,
    @Bind("EMP_ADDRESS") String eadd);
}