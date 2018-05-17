package com.betabeers.databindingexample.common

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.betabeers.databindingexample.extension.loadImage

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) = view.loadImage(url)

