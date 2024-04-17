package com.example.weather_xae.data.repository

import com.example.weather_xae.data.data_source.WeatherService
import com.example.weather_xae.domain.model.Weather
import com.example.weather_xae.domain.repository.WeatherRepository
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherService: WeatherService
) : WeatherRepository {
    override suspend fun getCurrentWeather(lat: Float, lan: Float): Response<Weather> = weatherService.getCurrentWeather(lat, lan)
}