package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityTest = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testLoginUI() {
        onView(withId(R.id.editTextLogin)).check(matches(isDisplayed()))
        onView(withId(R.id.editTextPassword)).check(matches(isDisplayed()))
        onView(withId(R.id.button)).check(matches(isDisplayed()))
        onView(withId(R.id.textView)).check(matches(isDisplayed()))
        onView(withId(R.id.editTextLogin)).perform(typeText("test"), closeSoftKeyboard())
        onView(withId(R.id.editTextPassword)).perform(typeText("123456"), closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText(R.string.auth_successful)))
    }
}