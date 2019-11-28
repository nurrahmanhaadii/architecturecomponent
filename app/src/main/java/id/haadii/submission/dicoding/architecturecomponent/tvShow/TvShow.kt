package id.haadii.submission.dicoding.architecturecomponent.tvShow

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShow(
    val title: String,
    val release: String,
    val overview: String,
    val runtime: String,
    val genre: String,
    val photo: Int
) : Parcelable