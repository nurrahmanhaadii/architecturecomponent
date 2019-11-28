package id.haadii.submission.dicoding.architecturecomponent.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val title: String,
    val release: String,
    val overview: String,
    val runtime: String,
    val genre: String,
    val photo: Int
) : Parcelable