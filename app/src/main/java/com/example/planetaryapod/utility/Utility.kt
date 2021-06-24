package com.example.planetaryapod.utility

import java.util.Calendar
import java.util.Date

fun getCurrentDateTime(): Date {
    return Calendar.getInstance().time
}