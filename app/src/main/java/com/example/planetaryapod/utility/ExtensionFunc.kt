package com.example.planetaryapod.utility

import android.graphics.Color
import android.view.View
import com.google.android.material.snackbar.Snackbar
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

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

fun Date.format(format: String, locale: Locale = Locale.getDefault()): String {
    val formatter = SimpleDateFormat(format, locale)
    return formatter.format(this)
}