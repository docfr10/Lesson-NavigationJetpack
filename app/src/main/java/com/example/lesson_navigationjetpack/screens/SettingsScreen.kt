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
fun SettingsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Экран settings")

        // Переход на экран домой
        Button({ navController.navigate(Screen.Home.route) }) { Text("Перейти на экран домой") }

        // Переход на экран деталей
        Button({ navController.navigate(Screen.Details.route) }) { Text("Перейти на экран деталей") }

        BackStackDebugPanel(navController)
    }
}