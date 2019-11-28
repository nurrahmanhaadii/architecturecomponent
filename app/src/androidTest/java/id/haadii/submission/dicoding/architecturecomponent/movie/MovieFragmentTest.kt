package id.haadii.submission.dicoding.architecturecomponent.movie

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import id.haadii.submission.dicoding.architecturecomponent.R
import id.haadii.submission.dicoding.architecturecomponent.main.MainActivity
import id.haadii.submission.dicoding.architecturecomponent.utils.RecyclerViewItemCountAssertion
import id.haadii.submission.dicoding.architecturecomponent.utils.SelectTabIndex
import org.junit.Rule
import org.junit.Test

@LargeTest
class MovieFragmentTest {

    @get:Rule
    val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.tab_layout)).perform(SelectTabIndex().selectTabAtPosition(0))
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).check(RecyclerViewItemCountAssertion(10))
    }

}