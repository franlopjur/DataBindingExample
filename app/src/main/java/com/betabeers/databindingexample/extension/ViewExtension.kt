package com.betabeers.databindingexample.extension

import android.support.annotation.IdRes
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso

//region View Extensions
fun <T : View> View.bindView(@IdRes res: Int): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE){ findViewById<T>(res) }
}

fun <T : View> View.bindViews(@IdRes resources: Array<Int>): List<Lazy<T>> {
    return resources.map { bindView<T>(it) }.toList()
}
//endregion

//region ImageView Extensions
fun ImageView.loadImage(url: String) {
    Picasso.get().load(url).into(this)
}
//endregion