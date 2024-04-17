package com.example.weather_xae.screens.main_screen.view_model

import com.example.weather_xae.domain.model.Weather

data class WeatherState(
    val currentWeather: Weather? = null,
    val lastUpdateTime: Long? = null,
    val wishForUser: String? = null,
    val currentPosition: String? = null
)
