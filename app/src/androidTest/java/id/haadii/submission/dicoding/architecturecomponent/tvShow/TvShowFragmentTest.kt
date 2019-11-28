package id.haadii.submission.dicoding.architecturecomponent.tvShow

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import id.haadii.submission.dicoding.architecturecomponent.R
import id.haadii.submission.dicoding.architecturecomponent.main.MainActivity
import id.haadii.submission.dicoding.architecturecomponent.utils.RecyclerViewItemCountAssertion
import id.haadii.submission.dicoding.architecturecomponent.utils.SelectTabIndex
import org.junit.Rule
import org.junit.Test

class TvShowFragmentTest {

    @get:Rule
    val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun loadTvShow() {
        Espresso.onView(ViewMatchers.withId(R.id.tab_layout)).perform(SelectTabIndex().selectTabAtPosition(1))
        Espresso.onView(ViewMatchers.withId(R.id.rv_tv_show))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.rv_tv_show))
            .check(RecyclerViewItemCountAssertion(10))
    }
}