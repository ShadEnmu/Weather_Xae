package com.example.weather_xae.domain.repository

import com.example.weather_xae.domain.model.Weather

interface WeatherRepository {
    suspend fun getCurrentWeather(city: String): Weather
}