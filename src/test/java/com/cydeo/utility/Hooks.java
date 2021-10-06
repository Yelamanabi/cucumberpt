package com.cydeo.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //we can set up hook class that contains
    // method that run before each scenario and after each scenario
    //or even when we learn tags
    // we can run certain code before and after each scenario that tagged with certain tag
    @Before
    public void setupDriver(){
        // set up implicit
        System.out.println("THIS IS FORM @Before inside hook class ");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){
        System.out.println("THIS IS FORM @After inside hook class ");
        Driver.closeBrowser();

    }
}
