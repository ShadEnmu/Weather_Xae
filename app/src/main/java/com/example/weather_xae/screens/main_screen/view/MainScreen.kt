package com.example.weather_xae.screens.main_screen.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather_xae.Greeting
import com.example.weather_xae.ui.theme.Weather_XaeTheme

@Composable
fun MainScreen() {
    Weather_XaeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Text(text = "TODO")
        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}