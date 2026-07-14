package com.example.a2ibi_mobile_developer_challenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.a2ibi_mobile_developer_challenge.ui.theme.*

@Composable
fun BottomBarNavigation(
    navController: NavController
){

    val items = listOf(
        BottomNavigationItem(
            route = Screen.Home.route,
            title = "Home",
            icon = Icons.Default.Home
        )
    )

    NavigationBar(
        containerColor = Surface,
        tonalElevation = 4.dp
    ){
        val currentRoute =
            navController
                .currentBackStackEntryAsState()
                .value
                ?.destination
                ?.route

        items.forEach { item ->
            val selected = currentRoute == item.route

            NavigationBarItem(
                selected = selected,
                onClick = {
                    if(!selected){
                        navController.navigate(item.route){
                            popUpTo(
                                Screen.Home.route
                            ){
                                inclusive = false
                            }
                            launchSingleTop = true
                        }
                    }
                },

                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint =
                            if(selected)
                                Secondary
                            else
                                OnSurface
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color =
                            if(selected)
                                OnBackground
                            else
                                OnSurface,
                        fontWeight = FontWeight.Bold
                    )
                },
                alwaysShowLabel = true
            )
        }
    }
}