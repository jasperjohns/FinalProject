package com.udacity.gradle.builditbigger;

/**
 * Created by asaldanha on 11/1/2015.
 */
public interface IGEPListener
{
    void downloadCompleted();

    void processCompleted(String result);

}