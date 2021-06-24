package com.example.planetaryapod.extentionfunc

import android.graphics.Color
import android.view.View
import com.google.android.material.snackbar.Snackbar

fun String.snack(color: Int, view: View) {
    val snackbar = Snackbar.make(view, this, Snackbar.LENGTH_LONG)
    snackbar.view.setBackgroundColor(color)
    snackbar.setTextColor(Color.WHITE)
    snackbar.show()
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.GONE
}