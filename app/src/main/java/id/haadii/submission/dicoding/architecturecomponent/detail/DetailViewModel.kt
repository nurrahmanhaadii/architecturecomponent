package id.haadii.submission.dicoding.architecturecomponent.detail

import android.app.Application
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import id.haadii.submission.dicoding.architecturecomponent.movie.Movie
import id.haadii.submission.dicoding.architecturecomponent.tvShow.TvShow

class DetailViewModel(application: Application) : AndroidViewModel(application) {

    private lateinit var movie : Movie
    private lateinit var tvShow: TvShow

    val title = MutableLiveData<String>()
    val date = MutableLiveData<String>()
    val runtime = MutableLiveData<String>()
    val overview = MutableLiveData<String>()
    val score = MutableLiveData<String>()
    val imageUrl = MutableLiveData<Int>()
    val photoUrl = MutableLiveData<Int>()

    companion object {
        @JvmStatic
        @BindingAdapter("imageUrl")
        fun setImageUrl(imageView: ImageView, url: Int?) {
            Glide.with(imageView)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView)
        }
    }

    fun getMovie() : Movie{
        return movie
    }

    fun getTvShow() : TvShow {
        return tvShow
    }

    fun setMovie(movie: Movie) {
        this.movie = movie
    }

    fun setDetailMovie() {
        title.value = getMovie().title
        date.value = getMovie().release
        runtime.value = "Runtime: ${getMovie().genre}"
        overview.value = getMovie().overview
        score.value = getMovie().runtime
        imageUrl.value = getMovie().photo
        photoUrl.value = getMovie().photo
    }

    fun setTvShow(tvShow: TvShow) {
        this.tvShow = tvShow
    }

    fun setDetailTvShow() {
        title.value = getTvShow().title
        date.value = getTvShow().release
        runtime.value = "Runtime: ${getTvShow().genre}"
        overview.value = getTvShow().overview
        score.value = getTvShow().runtime
        imageUrl.value = getTvShow().photo
        photoUrl.value = getTvShow().photo
    }
}