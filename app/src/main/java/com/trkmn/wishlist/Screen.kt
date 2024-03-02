package com.trkmn.wishlist

sealed class Screen (val route : String) {
    object HomeScreen : Screen("home-screen")
    object AddScreen : Screen("add-screen")
}