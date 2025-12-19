package com.example.lesson_navigationjetpack

// Общий класс для всех экранов
sealed class Screen(
    // Общее название всех маршрутов экранов
    val route: String
) {
    // Сами отдельные экраны приложения
    data object Home : Screen("home")
    data object Settings : Screen("settings")
    data object Details : Screen("details")
}