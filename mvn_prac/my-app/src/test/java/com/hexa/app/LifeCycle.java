package com.hexa.app;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class LifeCycle 
{

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass() :");   
    }

    @Before
    public void before() {
        System.out.println("before() :");   
    }

    @Test
    public void test1() {
        System.out.println("Test1() :");   
    }

    @Test
    public void test2() {
        System.out.println("Test2() :");   
    }

    @After
    public void after() {
        System.out.println("after() :");   
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass() :");   
    }

}