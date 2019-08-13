package com.hexa.training.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexa.training.model.*;
/**
 * TrainingDAO class used to fetch data from data base.
 * @author hexware
 */
public interface TrainingDao {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Trainings")
    @Mapper(TrainingMapper.class)
    List<Training> show();

  @SqlUpdate("insert into Trainings values(:tid,:training_name)")
    @Mapper(TrainingMapper.class)
    void insert(@Bind("tid")int tid,@Bind("training_name") String training_name);
}