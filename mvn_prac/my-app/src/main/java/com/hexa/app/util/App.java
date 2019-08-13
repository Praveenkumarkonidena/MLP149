package com.hexa.app.util;
import com.hexa.app.model.Login;
import com.hexa.app.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        Login l = new Login("1001","Praveen","12345","Nothing");
        System.out.println( "User Details : " + l );

        MyCalc m = new MyCalc();
        System.out.println("Addition : "+ m.add(1, 2));
        //System.out.println( "Hello World!" );
        //System.out.println( "Hello Praveen!" );
    }
}
