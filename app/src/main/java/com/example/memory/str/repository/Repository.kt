package com.example.memory.str.repository

import com.example.memory.str.api.RetrofitInstance
import com.example.memory.str.model.Post
import retrofit2.Response

/**
 * @author user
 * @date 13.08.2021
 */
class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}