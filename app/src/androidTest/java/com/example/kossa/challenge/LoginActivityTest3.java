package com.example.kossa.challenge;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class LoginActivityTest3 {

    private String incorrectEmail="host@gmail.com";
    private String passeword="gebe";

    @Rule
    public ActivityTestRule<LoginActivity> activityActivityTestRule=new ActivityTestRule<>(LoginActivity.class);
    private LoginActivity loginActivity=null;
    @Before
    public void setUp() throws Exception {
        loginActivity=activityActivityTestRule.getActivity();
    }
    @Test
    public void testActivity(){
        assertNotNull(loginActivity.findViewById(R.id.btn_login));
        onView(withId(R.id.tv_email)).perform(typeText(incorrectEmail));
        onView(withId(R.id.tv_password)).perform(typeText(passeword));
        onView(withId(R.id.btn_login)).perform(click());

    }
    @After
    public void tearDown() throws Exception {
        loginActivity=null;
    }

}