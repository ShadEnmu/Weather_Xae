package com.example.weather_xae.data.data_source

import com.example.weather_xae.domain.model.Weather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {

    @GET("weather?")
    suspend fun getCurrentWeather(
        @Query("lat") lat: Float,
        @Query("lon") lon: Float,
        @Query("appid") appid: String = "87388c361550ded1271d2852c87c4d54"
    ): Response<Weather>
}