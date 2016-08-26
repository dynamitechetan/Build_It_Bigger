package com.udacity.gradle.builditbigger;

import android.content.Context;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.concurrent.TimeUnit;


public class EndpointsAsyncTaskTest {

    EndpointsAsyncTask mEndpointsAsyncTask;

    @Mock
    Context mContext;

    @Before
    public void setUp() throws Exception {
        mEndpointsAsyncTask = new EndpointsAsyncTask(mContext){
            @Override
            protected void onPostExecute(String joke){
                //prevent test from launching activity
            }
        };
    }

    @Test
    public void AsyncTaskTest() throws Exception {
        String result = mEndpointsAsyncTask.execute().get(10, TimeUnit.SECONDS);
        Assert.assertNotNull(result);
    }
}