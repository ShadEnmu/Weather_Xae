package com.example.weather_xae.data.data_source

import com.example.weather_xae.domain.model.Weather
import retrofit2.http.GET


interface WeatherService {

    @GET("weather?q=London&appid=d54523cecacc224858995f2e0c1591f8")
    suspend fun getCurrentWeather(): Weather
}