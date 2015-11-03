package com.udacity.gradle.builditbigger;

import android.test.UiThreadTest;

import junit.framework.TestCase;

import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by asaldanha on 10/30/2015.
 */
public class EndpointsAsyncTaskTest extends TestCase implements  IGEPListener {


    public EndpointsAsyncTaskTest(){

    }
    public void testDoInBackground()  {
            assertEquals(1,1);
    }

    GEPAsyncTask gepAyncTask;
    CountDownLatch signal;

    protected void setUp() throws Exception {
        super.setUp();

        signal = new CountDownLatch(1);
        gepAyncTask = new GEPAsyncTask(this);

    }

    @UiThreadTest
    public void testDownload() throws InterruptedException
    {
        URL url;
        url=null;
        gepAyncTask.download(url);
        signal.await(30, TimeUnit.SECONDS);

        assertTrue( "assert something meaningful here", true );
    }

    @Override
    public void downloadCompleted()
    {
        signal.countDown();
    }

    @Override
    public void processCompleted(String result){

    }

}