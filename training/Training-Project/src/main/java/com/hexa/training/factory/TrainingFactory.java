package com.hexa.training.factory;
import com.hexa.training.persistence.*;
//import java.util.*;
import java.util.List;
import com.hexa.training.model.Training;


public class TrainingFactory {
    private static TrainingDao dao() {
        DbConnection db = new DbConnection();
        return db.getConnect().onDemand(TrainingDao.class);
    }

    public static Training[] fetchData() {
        List<Training> ls = dao().show();
        // return ls;
        return ls.toArray(new Training[ls.size()]);
    }

    public static String insertData(int tid,String training_name){
        dao().insert(tid,training_name);
        return "inserted";
    }

}