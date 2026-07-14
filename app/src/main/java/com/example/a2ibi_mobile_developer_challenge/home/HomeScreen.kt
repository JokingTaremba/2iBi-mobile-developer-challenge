package com.example.a2ibi_mobile_developer_challenge.home

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.a2ibi_mobile_developer_challenge.data.RepositoryProvider
import com.example.a2ibi_mobile_developer_challenge.home.components.CountryCard
import com.example.a2ibi_mobile_developer_challenge.ui.components.BackgroundScaffold
import com.example.a2ibi_mobile_developer_challenge.ui.theme.OnBackground
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Primary
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Surface
import com.example.a2ibi_mobile_developer_challenge.viewModel.CountryUiState
import com.example.a2ibi_mobile_developer_challenge.viewModel.CountryViewModel
import com.example.a2ibi_mobile_developer_challenge.viewModel.CountryViewModelFactory

@Composable
fun HomeScreen(
    navController: NavController
){
    val viewModel: CountryViewModel = viewModel(
        factory = CountryViewModelFactory(
            RepositoryProvider.countryRepository
        )
    )

    val uiState by viewModel.uiState.collectAsState()

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
                            imageVector = Icons.Outlined.ArrowBack,
                            contentDescription = "Icon de Volta",
                            tint = OnBackground
                        )
                    }
                }
            )
        }

    ) {
        when(val state = uiState){

            is CountryUiState.Loading -> {
                Text(
                    text = "Carregando países...",
                    color = OnBackground
                )
            }
            is CountryUiState.Error -> {
                Text(
                    text = state.message,
                    color = Primary
                )
            }

            is CountryUiState.Success -> {
                LazyColumn {
                    items(
                        items = state.countries,
                        key = {
                            it.name?.common ?: ""
                        }
                    ){ country ->
                        CountryCard(
                            country = country,
                            onClick = {
                                // navController.navigate("country/${country.name}")
                            }
                        )
                    }
                }
            }
        }
    }
}