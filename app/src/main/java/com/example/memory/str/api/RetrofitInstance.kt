package com.example.memory.str.api

import com.example.memory.str.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author user
 * @date 13.08.2021
 */
object RetrofitInstance {


    //Retrofit object in Singelton pattern

    private val retrofit by lazy {
        Retrofit
            .Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}