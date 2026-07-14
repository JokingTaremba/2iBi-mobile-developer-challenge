package com.example.a2ibi_mobile_developer_challenge.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.a2ibi_mobile_developer_challenge.data.model.Country
import com.example.a2ibi_mobile_developer_challenge.data.repository.CountryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CountryViewModel(
    private val repository: CountryRepository
): ViewModel(){

    private val _countries =
        MutableStateFlow<List<Country>>(emptyList())

    val countries: StateFlow<List<Country>>
        get() = _countries

    private val _error =
        MutableStateFlow<String?>(null)

    val error: StateFlow<String?>
        get() = _error

    fun fetchCountries(){
        viewModelScope.launch {
            try {
                _countries.value =
                    repository.getCountries()
            }catch(e: Exception){
                _error.value =
                    e.message
            }
        }
    }
}