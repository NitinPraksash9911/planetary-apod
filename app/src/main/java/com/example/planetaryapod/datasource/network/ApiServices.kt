package com.example.planetaryapod.datasource.network

import com.example.planetaryapod.datasource.model.Planetary
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {

    @GET("planetary/apod")
    suspend fun getNewsData(): Response<Planetary>

}