package com.example.weather_xae.screens.main_screen.view_model

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather_xae.data.repository.WeatherRepositoryImpl
import com.example.weather_xae.domain.model.Weather
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val weatherRepositoryImpl: WeatherRepositoryImpl
) : ViewModel() {
    private val state = mutableStateOf(WeatherState())
    val _state = state

    init {
        viewModelScope.launch {
            state.value = state.value.copy(
                currentWeather = getWeather()
            )
        }
    }

    fun onEvent(event: WeatherEvent) {
        when (event) {
            WeatherEvent.OnWeatherRequest -> {
                viewModelScope.launch {
                    state.value = state.value.copy(
                        currentWeather = getWeather()
                    )
                }
            }
            WeatherEvent.OnCityChanged -> TODO()
        }
    }

    suspend fun getWeather() : Weather? {
        var result: Weather
        var error: String = "retrofit response: no errors"
        weatherRepositoryImpl.getCurrentWeather(44.34f, 10.99f).let { response ->
            if (!response.isSuccessful) {
                error = response.message()
                Log.d(":dev", "getWeather: $error")
                return null
            }
            result = response.body()!!
        }
        return result
    }
}