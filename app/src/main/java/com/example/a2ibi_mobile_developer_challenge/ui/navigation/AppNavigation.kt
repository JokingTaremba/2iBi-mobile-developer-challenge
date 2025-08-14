package com.example.a2ibi_mobile_developer_challenge.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.a2ibi_mobile_developer_challenge.ui.screens.HomeScreen

@Composable
fun AppNavigation (
){
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold (
        bottomBar = {
            BottomBarNavigation(navController = navController)
        }
    ){ innerPadding ->
       NavHost(
           navController = navController,
           startDestination = "home",
           modifier = Modifier.padding(innerPadding)
       ){
           composable("home"){
               HomeScreen(navController)
           }
       }

    }
}