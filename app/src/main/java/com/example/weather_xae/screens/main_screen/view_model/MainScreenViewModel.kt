package com.example.weather_xae.screens.main_screen.view_model

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather_xae.data.repository.WeatherRepositoryImpl
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@ViewModelScoped
class MainScreenViewModel @Inject constructor(
    private val weatherRepositoryImpl: WeatherRepositoryImpl
): ViewModel() {
    private val state = mutableStateOf(WeatherState())
    var _state = state

    fun onEvent(event: WeatherEvent) {
        when(event) {
            WeatherEvent.OnWeatherRequest -> {
                viewModelScope.launch {
                    state.value = state.value.copy(
                        currentWeather = weatherRepositoryImpl.getCurrentWeather()
                    )
                }
            }

            WeatherEvent.OnCityChanged -> TODO()
        }
    }
}