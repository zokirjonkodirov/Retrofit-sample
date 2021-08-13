package com.example.memory.str.api

import com.example.memory.str.model.Post
import retrofit2.Response
import retrofit2.http.GET

/**
 * @author user
 * @date 13.08.2021
 */
interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Response<Post>
}