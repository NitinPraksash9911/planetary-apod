package com.example.planetaryapod.datasource.repository


import com.example.planetaryapod.datasource.model.Planetary
import com.example.planetaryapod.datasource.roomdb.PlanetaryDao
import javax.inject.Inject

class LocalPlanetaryRepo @Inject constructor(private val planetaryDao: PlanetaryDao) {

    suspend fun insertPlanetary(planetary: Planetary) {
        planetaryDao.insert(planetary)
    }

    fun getPlanetaryData() = planetaryDao.getPlanetaryData()

}

