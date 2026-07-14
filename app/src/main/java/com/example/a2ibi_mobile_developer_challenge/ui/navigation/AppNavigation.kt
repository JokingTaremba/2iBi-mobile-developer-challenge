package com.example.a2ibi_mobile_developer_challenge.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.a2ibi_mobile_developer_challenge.home.HomeScreen

@Composable
fun AppNavigation (){

    val navController = rememberNavController()

    Scaffold (
        bottomBar = {
            BottomBarNavigation(navController)
        }
    ){ padding ->

       NavHost(
           navController = navController,
           startDestination = Screen.Home.route,
           modifier = Modifier.padding(padding)
       ){
           composable(Screen.Home.route){
               HomeScreen(navController)
           }
       }

    }
}