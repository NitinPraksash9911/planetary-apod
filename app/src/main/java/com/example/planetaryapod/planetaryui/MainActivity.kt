package com.example.planetaryapod.planetaryui

import android.graphics.Color
import android.os.Bundle
import androidx.activity.viewModels
import com.example.planetaryapod.R
import com.example.planetaryapod.arch.BaseActivity
import com.example.planetaryapod.arch.Result
import com.example.planetaryapod.arch.Result.Status.ERROR
import com.example.planetaryapod.arch.Result.Status.LOADING
import com.example.planetaryapod.arch.Result.Status.SUCCESS
import com.example.planetaryapod.databinding.ActivityMainBinding
import com.example.planetaryapod.datasource.model.Planetary
import com.example.planetaryapod.utility.hide
import com.example.planetaryapod.utility.show
import com.example.planetaryapod.utility.snack
import com.example.planetaryapod.planetaryui.viewmodel.PlanetaryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val mainViewModel by viewModels<PlanetaryViewModel>()

    private lateinit var binding: ActivityMainBinding

    override fun init(savedInstanceState: Bundle?, binding: ActivityMainBinding) {

        this.binding = binding

        mainViewModel.getPlanetary.observe(this) {
            renderData(it)
        }

    }

    private fun renderData(resultState: Result<Planetary>) {
        when (resultState.status) {
            SUCCESS -> {

                binding.planetary = resultState.data

                binding.progressBar.hide()

            }
            LOADING -> {

                binding.progressBar.show()
            }
            ERROR -> {

                resultState.message!!.snack(
                    Color.RED,
                    binding.parentLayout
                )
                binding.progressBar.hide()

            }

        }
    }

}