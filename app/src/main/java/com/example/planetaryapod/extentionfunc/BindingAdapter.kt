package com.example.planetaryapod.extentionfunc

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.planetaryapod.R

/**
 * Uses the Glide library to load an image by URL into an [ImageView]
 */
@BindingAdapter("imageUrl")
fun bindImageUrl(imgView: ImageView, imgUrl: String?) {
    Glide.with(imgView.context)
        .load(imgUrl)
        .centerCrop()
        .placeholder(R.drawable.loading_animation)
        .error(R.drawable.ic_broken_image)
        .into(imgView)

}