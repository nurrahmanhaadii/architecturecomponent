package id.haadii.submission.dicoding.architecturecomponent.detail

import android.app.Application
import id.haadii.submission.dicoding.architecturecomponent.repository.Repository
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private val movie = Repository().getMovie()[0]
    private val tvShow = Repository().getTvShow()[0]

    @Mock
    val application = Application()

    @Before
    fun setUp() {
        viewModel = DetailViewModel(application)
    }

    @Test
    fun getMovie() {
        val movie = viewModel.setMovie(movie)
        assertNotNull(movie)
    }

    @Test
    fun getTvShow() {
        val tvShow = viewModel.setTvShow(tvShow)
        assertNotNull(tvShow)
    }
}