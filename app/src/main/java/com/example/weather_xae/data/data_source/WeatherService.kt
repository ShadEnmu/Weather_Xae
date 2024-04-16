package com.example.weather_xae.data.data_source

import com.example.weather_xae.domain.model.Weather
import retrofit2.http.GET
import retrofit2.http.Path


interface WeatherService {

    @GET("weather?q={city}&appid=87388c361550ded1271d2852c87c4d54")
    suspend fun getCurrentWeather(@Path("city") city: String): Weather
}