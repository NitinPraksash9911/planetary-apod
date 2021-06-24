package com.example.planetaryapod.datasource.repository


import com.example.planetaryapod.datasource.network.ApiFactory
import com.example.planetaryapod.datasource.network.ApiServices
import com.example.planetaryapod.datasource.network.ResponseHandler
import javax.inject.Inject

class RemotePlanetaryRepo @Inject constructor(private val apiFactory: ApiFactory) : ResponseHandler() {

    suspend fun getData() =
        getResult {
            apiFactory.createService(ApiServices::class.java)
                .getNewsData()
        }

}