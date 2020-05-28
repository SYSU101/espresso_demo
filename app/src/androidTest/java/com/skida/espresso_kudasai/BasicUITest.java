package com.skida.espresso_kudasai;

import android.app.Activity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class BasicUITest {

    final String name = "Espresso";
    final String expectedText = "Hello Espresso!";

    @Rule public ActivityScenarioRule<MainActivity> activityScenarioRule
        = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void basicTest() {
        onView(withId(R.id.editText)).perform(
                typeText(name),
                closeSoftKeyboard()
        );
        onView(withId(R.id.button)).perform(
                click()
        );
        onView(withId(R.id.greetText)).check(
                matches(withText(expectedText))
        );
    }
}