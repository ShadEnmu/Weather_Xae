package com.example.weather_xae.screens.main_screen.view_model

sealed class WeatherEvent {
    object OnWeatherRequest : WeatherEvent();
    object OnCityChanged : WeatherEvent();

}