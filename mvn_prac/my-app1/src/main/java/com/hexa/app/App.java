package com.hexa.app;
import com.hexa.app.model.Login;

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
        //System.out.println( "Hello World!" );
    }
}
