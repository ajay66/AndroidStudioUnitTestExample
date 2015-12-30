package com.example.ajaybabup.myunittestsample;

import android.app.Application;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

import junit.framework.Assert;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityUnitTestCase<MainActivity>
{

    MainActivity mact;
    TextView txt_hello;

    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        startActivity(new Intent(getInstrumentation().getTargetContext(), MainActivity.class), null, null);
        mact=(MainActivity)getActivity();


    }
    @SmallTest
    public void testMethod()
    {
        txt_hello=(TextView)mact.findViewById(R.id.txt_hello);
        String str=txt_hello.getText().toString();
        Assert.assertEquals("Hello world!",str);

    }

    @SmallTest
    public void testCondition()
    {
        Assert.assertTrue(true);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}