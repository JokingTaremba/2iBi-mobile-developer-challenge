package com.example.a2ibi_mobile_developer_challenge.viewModel

import com.example.a2ibi_mobile_developer_challenge.data.model.Country
sealed class CountryUiState {
    object Loading : CountryUiState()
    data class Success(
        val countries: List<Country>
    ) : CountryUiState()

    data class Error(
        val message: String
    ) : CountryUiState()
}