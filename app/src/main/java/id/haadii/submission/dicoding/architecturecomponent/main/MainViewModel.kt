package id.haadii.submission.dicoding.architecturecomponent.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import id.haadii.submission.dicoding.architecturecomponent.movie.Movie
import id.haadii.submission.dicoding.architecturecomponent.repository.Repository
import id.haadii.submission.dicoding.architecturecomponent.tvShow.TvShow

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Repository()

    fun getMovie() : ArrayList<Movie> {
        return repository.getMovie()
    }

    fun getTvShow() : ArrayList<TvShow> {
        return repository.getTvShow()
    }

}