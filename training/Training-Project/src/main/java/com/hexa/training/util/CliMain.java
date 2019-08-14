package com.hexa.training.util;
import com.hexa.training.factory.*;
import com.hexa.training.model.Training;
import java.util.Scanner;
// import java.util.List;


/**
 * Hello world!
 *
 */
public class CliMain 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
       // Training[] result = TrainingFactory.fetchData();
        //for(Training trg:result){
        //    System.out.println(trg.getTid()+"  "+trg.getTraining_name());
        

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the tid");
    int tid=s.nextInt();
    System.out.println("Enter the tname:");
    String training_name=s.next();
    //List<Training> result= TrainingFactory.fetchData();
    Training[] result= TrainingFactory.fetchData();
      for(Training trg:result){
        System.out.println(trg.getTid()+"   "+trg.getTraining_name());
      }
      String value=TrainingFactory.insertData(tid,training_name );
      System.out.println("The value is:"+value);
      System.out.println(tid+"  "+ training_name);
    }
}


