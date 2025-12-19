package com.example.lesson_navigationjetpack.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.lesson_navigationjetpack.Screen

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Экран home")

        // Переход на экран настроек
        Button({ navController.navigate(Screen.Settings.route) }) { Text("Перейти на экран настроек") }

        // Переход на экран деталей
        Button({ navController.navigate(Screen.Details.route) }) { Text("Перейти на экран деталей") }

        BackStackDebugPanel(navController)
    }
}