package com.example.weather_xae.screens.main_screen.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.weather_xae.screens.main_screen.view_model.MainScreenViewModel
import com.example.weather_xae.ui.theme.Weather_XaeTheme

@Composable
fun MainScreen(mainScreenViewModel: MainScreenViewModel = hiltViewModel()) {
    Weather_XaeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            mainScreenViewModel._state.value.currentWeather?.name?.let { Text(text = it) }
        }
    }
}

//@Preview
//@Composable
//private fun MainScreenPreview() {
//    MainScreen()
//}