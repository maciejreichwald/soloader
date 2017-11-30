package com.rudearts.soloader.extentions

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.loadUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}

fun ImageView.loadUrlThumb(size:Int, placeHolderId:Int, url: String) {
    val placeHolder = resources.getDrawable(placeHolderId)
    Picasso.with(context)
            .load(url)
            .resize(size, size)
            .placeholder(placeHolder)
            .error(placeHolder)
            .centerCrop()
            .into(this)
}
