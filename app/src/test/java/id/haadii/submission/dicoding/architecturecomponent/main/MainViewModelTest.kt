package id.haadii.submission.dicoding.architecturecomponent.main

import android.app.Application
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {
    private lateinit var viewModel: MainViewModel

    @Mock
    val application = Application()

    @Before
    fun setUp() {
        viewModel = MainViewModel(application)
    }

    @Test
    fun getMovies() {
        val movies = viewModel.getMovie()
        assertNotNull(movies)
        assertEquals(10, movies.size)
    }

    @Test
    fun getTvShows() {
        val tvShows = viewModel.getTvShow()
        assertNotNull(tvShows)
        assertEquals(10, tvShows.size)
    }
}