package com.example.moviesapp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("page")
    val page : Int,
    @SerializedName("results")
    val movies : List<Movie>

) : Parcelable