package com.jefisu.wallpaperscompose.util

sealed class Screen(val route: String) {
    object Greeting : Screen("greeting_screen")
    object Home : Screen("home_screen")
}