package com.example.a2ibi_mobile_developer_challenge.ui.navigation

sealed class Screen(
    val route: String
) {
    object Home : Screen(
        route = "home"
    )

    object CountryDetail : Screen(
        route = "country_detail/{countryName}"
    ){
        fun createRoute(countryName: String): String {
            return "country_detail/$countryName"
        }
    }
}