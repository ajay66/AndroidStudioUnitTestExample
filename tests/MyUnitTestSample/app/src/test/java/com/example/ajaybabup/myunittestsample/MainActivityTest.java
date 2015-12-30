package com.example.ajaybabup.myunittestsample;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MainActivityTest extends TestCase {

    MainActivity myact;
    public void setUp() throws Exception {
        super.setUp();
        myact=new MainActivity();
    }



    @SmallTest
    public void testTrue()
    {
        Assert.assertTrue(true);
    }


    @SmallTest
    public void testMethod()
    {
        int d=myact.addNumbers(10,20);
        Assert.assertEquals(30,d);
    }

    public void tearDown() throws Exception {

    }
}