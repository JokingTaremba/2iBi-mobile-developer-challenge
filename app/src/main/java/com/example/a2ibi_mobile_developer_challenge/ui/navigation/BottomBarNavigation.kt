package com.example.a2ibi_mobile_developer_challenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Pink80
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Purple80
import com.example.a2ibi_mobile_developer_challenge.ui.theme.PurpleGrey80

@Composable
fun BottomBarNavigation (navController: NavController){
    val items = mutableListOf(
        BottomNavigationItem("home", "Inicio", Icons.Default.Menu)
    )

    NavigationBar (
        containerColor = Purple80,
        tonalElevation = 4.dp
    ){
        val navBackStackEntry = navController.currentBackStackEntryAsState().value
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            val selected = currentRoute == item.route
            NavigationBarItem(
                icon = {
                    Icon(
                        item.icon,
                        contentDescription = item.title,
                        tint = if (selected) Pink80 else PurpleGrey80) },

                label = {
                    Text(
                        text = item.title,
                        color = if (selected) Pink80 else PurpleGrey80,
                        fontWeight = FontWeight.Bold) },

                selected = selected,

                    onClick = {
                        if (!selected) {
                            navController.navigate(item.route){
                                popUpTo("home"){inclusive = false}
                                launchSingleTop = true
                            }
                        }
                    },
                alwaysShowLabel = true
            )
        }
    }
}