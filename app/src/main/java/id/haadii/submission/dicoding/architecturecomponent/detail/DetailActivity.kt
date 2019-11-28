package id.haadii.submission.dicoding.architecturecomponent.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import id.haadii.submission.dicoding.architecturecomponent.R
import id.haadii.submission.dicoding.architecturecomponent.databinding.ActivityDetailBinding
import id.haadii.submission.dicoding.architecturecomponent.movie.Movie
import id.haadii.submission.dicoding.architecturecomponent.tvShow.TvShow

class DetailActivity : AppCompatActivity() {

    private lateinit var viewModel: DetailViewModel
    private lateinit var dataBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val movie = intent.getParcelableExtra("movie") as Movie?
        val tv = intent.getParcelableExtra("tv_show") as TvShow?

        viewModel = ViewModelProviders.of(this).get(DetailViewModel::class.java)

        if (movie != null) {
            viewModel.setMovie(movie)
            viewModel.setDetailMovie()
            title = "Detail ${movie.title}"
        } else if (tv != null) {
            viewModel.setTvShow(tv)
            viewModel.setDetailTvShow()
            title = "Detail ${tv.title}"
        }

        dataBinding.viewmodel = viewModel

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
