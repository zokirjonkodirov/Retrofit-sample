package com.example.memory.str

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.memory.str.repository.Repository

/**
 * @author user
 * @date 13.08.2021
 */
class MainViewModelFactory(
    private val repository: Repository
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }

}