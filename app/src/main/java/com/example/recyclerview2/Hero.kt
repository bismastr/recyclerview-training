package com.example.recyclerview2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    var name: String = "",
    var description: String = "",
    var img: String = ""
) : Parcelable
