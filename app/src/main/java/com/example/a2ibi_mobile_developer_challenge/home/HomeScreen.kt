package com.example.a2ibi_mobile_developer_challenge.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.a2ibi_mobile_developer_challenge.data.RepositoryProvider
import com.example.a2ibi_mobile_developer_challenge.ui.components.BackgroundScaffold
import com.example.a2ibi_mobile_developer_challenge.home.components.CountryCard
import com.example.a2ibi_mobile_developer_challenge.ui.theme.OnBackground
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Surface
import com.example.a2ibi_mobile_developer_challenge.viewModels.CountryViewModel
import com.example.a2ibi_mobile_developer_challenge.viewModels.CountryViewModelFactory
import androidx.compose.runtime.getValue

@Composable
fun HomeScreen (
    navController: NavController
){
    val viewModel: CountryViewModel = viewModel(
        factory = CountryViewModelFactory(
            RepositoryProvider.countryRepository
        )
    )

    val countries by viewModel.countries.collectAsState()

    LaunchedEffect(Unit){
        viewModel.fetchCountries()
    }

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
        LazyColumn {

            items(countries){ country ->

                CountryCard(
                    country = country
                )

            }

        }

    }
}