package com.example.a2ibi_mobile_developer_challenge.ui.screens.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.a2ibi_mobile_developer_challenge.ui.components.BackgroundScaffold
import com.example.a2ibi_mobile_developer_challenge.ui.screens.home.components.CountryCard
import com.example.a2ibi_mobile_developer_challenge.ui.theme.OnBackground
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Surface

@ExperimentalMaterial3Api
@Composable
fun HomeScreen (navController: NavController){
    BackgroundScaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Surface,
                    titleContentColor = OnBackground,
                ),
                title = {
                    Text("Countries")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Menu,
                            contentDescription = "Icon de Volta",
                            tint = OnBackground
                        )
                    }
                }
            )
        }

    ) {
        CountryCard()
        CountryCard()
        CountryCard()
        CountryCard()

    }
}