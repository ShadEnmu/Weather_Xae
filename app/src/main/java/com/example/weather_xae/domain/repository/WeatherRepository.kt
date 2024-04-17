package com.example.weather_xae.domain.repository

import com.example.weather_xae.domain.model.Weather
import retrofit2.Call
import retrofit2.Response

interface WeatherRepository {
    suspend fun getCurrentWeather(lat: Float, lan: Float): Response<Weather>
}