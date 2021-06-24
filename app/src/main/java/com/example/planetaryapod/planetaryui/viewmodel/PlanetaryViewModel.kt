package com.example.planetaryapod.planetaryui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.planetaryapod.datasource.repository.PlanetaryRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PlanetaryViewModel @Inject constructor(private val planetaryRepo: PlanetaryRepo) : ViewModel() {

    val getPlanetary = planetaryRepo.getPlanetData(viewModelScope.coroutineContext)

}