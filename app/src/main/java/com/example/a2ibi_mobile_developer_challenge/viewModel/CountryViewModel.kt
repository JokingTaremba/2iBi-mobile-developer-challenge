package com.example.a2ibi_mobile_developer_challenge.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.a2ibi_mobile_developer_challenge.data.repository.CountryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CountryViewModel(
    private val repository: CountryRepository
) : ViewModel() {

    private val _uiState =
        MutableStateFlow<CountryUiState>(
            CountryUiState.Loading
        )

    val uiState: StateFlow<CountryUiState> =
        _uiState.asStateFlow()

    fun fetchCountries(){
        viewModelScope.launch {
            _uiState.value =
                CountryUiState.Loading
            try {
                val countries =
                    repository.getCountries()

                _uiState.value =
                    CountryUiState.Success(
                        countries
                    )
            } catch(e: Exception){
                _uiState.value =
                    CountryUiState.Error(
                        e.message
                            ?: "Erro desconhecido"
                    )
            }
        }
    }
}