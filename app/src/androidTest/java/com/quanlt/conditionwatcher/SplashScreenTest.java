package com.quanlt.conditionwatcher;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by quanlt on 4/20/17.
 */
@RunWith(AndroidJUnit4.class)
public class SplashScreenTest {
    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule(SplashActivity.class);

    @Test
    public void testFirst() throws Exception {
        ConditionWatcher.waitForCondition(new Instruction() {
            @Override
            public void apply() {
                onView(withId(R.id.edit_email)).perform(typeText("Ethan"));
            }
        });

        onView(withId(R.id.button_submit)).perform(click());
        ConditionWatcher.setTimeoutLimit(2000);
        ConditionWatcher.waitForCondition(new Instruction() {
            @Override
            public void apply() {
                onView(withId(R.id.text_greeting)).check(matches(withText("Hello Ethan")));
            }
        });


    }
}
