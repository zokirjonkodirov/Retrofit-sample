package com.example.memory.str

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.memory.str.model.Post
import com.example.memory.str.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

/**
 * @author user
 * @date 13.08.2021
 */
class MainViewModel(private val repository: Repository): ViewModel() {
    val myResponse: MutableLiveData<Response<Post>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            val response: Response<Post> = repository.getPost()
            myResponse.value = response
        }
    }
}