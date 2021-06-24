package com.example.planetaryapod.datasource.repository

import androidx.lifecycle.liveData
import androidx.lifecycle.map
import com.example.planetaryapod.arch.Result
import com.example.planetaryapod.datasource.model.Planetary
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class PlanetaryRepo @Inject constructor(
    private val localPlanetaryRepo: LocalPlanetaryRepo,
    private val remotePlanetaryRepo: RemotePlanetaryRepo
) {

    fun getPlanetData(viewModelContext: CoroutineContext) = liveData(viewModelContext + Dispatchers.IO) {

        emit(Result.loading())

        /**
         * observation for local data
         * */
        val localData = localPlanetaryRepo.getPlanetaryData()

        emitSource(localData.map { Result.success(data = it) })

        /*----------------------------------------------------------------------------------------------------------------*/

        /**
         * observation for remote data
         * */
        val remoteData = remotePlanetaryRepo.getData()

        if (remoteData.status == Result.Status.SUCCESS) {

            localPlanetaryRepo.insertPlanetary(remoteData.data!!)

        } else if (remoteData.status == Result.Status.ERROR) {

            emit(Result.error<Planetary>(remoteData.message!!))
        }

    }

}