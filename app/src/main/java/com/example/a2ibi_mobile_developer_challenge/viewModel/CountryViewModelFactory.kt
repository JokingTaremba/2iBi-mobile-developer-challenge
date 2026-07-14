package com.example.a2ibi_mobile_developer_challenge.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.a2ibi_mobile_developer_challenge.data.repository.CountryRepository

class CountryViewModelFactory(
    private val repository: CountryRepository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(
        modelClass: Class<T>
    ): T {
        if(modelClass.isAssignableFrom(
                CountryViewModel::class.java
            )){
            return CountryViewModel(repository) as T
        }
        throw IllegalArgumentException(
            "Unknown ViewModel"
        )
    }
}