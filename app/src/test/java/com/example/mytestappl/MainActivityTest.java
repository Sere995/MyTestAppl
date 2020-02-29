package com.example.mytestappl;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class MainActivityTest {

    @Rule public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
        //comment
    }

    @Test
    public void testLaunch(){
        View view = mActivity.findViewById(R.id.MainActivity);

        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }


}