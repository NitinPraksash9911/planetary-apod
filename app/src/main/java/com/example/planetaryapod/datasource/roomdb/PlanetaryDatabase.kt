package com.example.planetaryapod.datasource.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.planetaryapod.datasource.model.Planetary

const val DATABASE_NAME = "planetary_database"

@Database(entities = [Planetary::class], version = 1, exportSchema = false)
abstract class PlanetaryDatabase : RoomDatabase() {

    abstract fun getPlanetaryDao(): PlanetaryDao

}