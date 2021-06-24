package com.example.planetaryapod.datasource.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.planetaryapod.datasource.model.Planetary

@Dao
interface PlanetaryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(planetary: Planetary)

    @Query("SELECT * FROM planetary_table WHERE id=0")
    fun getPlanetaryData(): LiveData<Planetary>
}