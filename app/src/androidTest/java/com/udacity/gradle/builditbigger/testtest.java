package com.udacity.gradle.builditbigger.test;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class testtest extends ApplicationTestCase<Application> {
    public testtest() {
        super(Application.class);
    }
    public void testBlah(){
        assertEquals(1,1);
    }

}