package com.lambdaschool.congressdata


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(AndroidJUnit4::class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

class DetailsActivityTest {

    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(DetailsActivity::class.java)

    @Test
    fun personCheck(){
        onView(withId(R.id.profile_name)).check(matches(withText("Trent P. Kelly")))
        onView(withId(R.id.profile_party)).check(matches(withText("Republican")))
        onView(withId(R.id.profile_district)).check(matches(withText("Mississippi - District 10")))
        onView(withId(R.id.profile_twitter)).check(matches(withText("Twitter")))
        onView(withId(R.id.profile_facebook)).check(matches(withText("Facebook")))
        onView(withId(R.id.profile_map)).check(matches(withText("1721 Longworth House Office Building")))
        onView(withId(R.id.profile_phone)).check(matches(withText("202-225-4306")))


    }


}