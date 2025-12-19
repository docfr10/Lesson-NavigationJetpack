package com.example.lesson_navigationjetpack

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lesson_navigationjetpack.screens.DetailsScreen
import com.example.lesson_navigationjetpack.screens.HomeScreen
import com.example.lesson_navigationjetpack.screens.SettingsScreen

@Composable
fun App(innerPadding: PaddingValues) {
    // Объект, отвечающий за управление навигацей
    val navController = rememberNavController()

    // Хаб со всеми возможными маршрутами в приложении
    NavHost(
        modifier = Modifier.padding(paddingValues = innerPadding),
        navController = navController,
        // Стартовый экран, с которого начнется работа пользователя в приложении
        startDestination = Screen.Home.route
    ) {
        // Маршрут для отдельного экрана "home"
        composable(route = Screen.Home.route) {
            HomeScreen(navController)
        }

        // Маршрут для отдельного экрана "settings"
        composable(route = Screen.Settings.route) {
            SettingsScreen(navController)
        }

        // Маршрут для отдельного экрана "details"
        composable(route = Screen.Details.route) {
            DetailsScreen(navController)
        }
    }
}

















