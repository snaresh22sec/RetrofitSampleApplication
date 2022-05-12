package com.retrofitsampleapplication.respository

import com.retrofitsampleapplication.model.QuoteList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    val baseURL = "https://quotable.io/"

   /* fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseURL)
            .build()
    }*/

    val api: QuoteList by lazy{
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseURL)
            .build()
            .create(QuoteList::class.java)
    }
}