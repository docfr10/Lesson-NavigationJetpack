package com.example.lesson_navigationjetpack.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BackStackDebugPanel(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val currentEntry by navController.currentBackStackEntryAsState()

    val currentRoute = currentEntry?.destination?.route
    val previousRoute = navController.previousBackStackEntry?.destination?.route

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        HorizontalDivider()
        Text(text = "NavGraph start: ${navController.graph.startDestinationRoute}")
        Text(text = "Current route: $currentRoute")
        Text(text = "Previous route: $previousRoute")
    }
}