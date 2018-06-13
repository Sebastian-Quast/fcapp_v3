package de.thkoeln.fcappv3.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ViewGroup.inflate(layoutRes: Int): View =
    LayoutInflater.from(context).inflate(layoutRes, this, false)


fun ImageView.loadUrl(url:String) =
        Glide.with(context).load(url).into(this)

