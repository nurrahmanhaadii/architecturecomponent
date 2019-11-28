package id.haadii.submission.dicoding.architecturecomponent.detail

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import id.haadii.submission.dicoding.architecturecomponent.R
import id.haadii.submission.dicoding.architecturecomponent.utils.FakeDataDummy
import org.junit.Rule
import org.junit.Test

class DetailMovieTest {
    private val movie = FakeDataDummy().getMovie()[0]

    @get:Rule
    val activityRule = object : ActivityTestRule<DetailActivity>(DetailActivity::class.java){
        override fun getActivityIntent() : Intent{
            val context = InstrumentationRegistry.getInstrumentation().targetContext
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("movie", movie)
            return intent
        }
    }

    @Test
    fun loadMovie() {
        onView(withId(R.id.img_background)).check(matches(isDisplayed()))
        onView(withId(R.id.img_photo_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_tittle_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_runtime)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview_content)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_content)).check(matches(isDisplayed()))
    }

}