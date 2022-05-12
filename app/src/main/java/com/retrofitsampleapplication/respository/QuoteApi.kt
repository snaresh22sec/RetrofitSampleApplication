package com.retrofitsampleapplication.respository

import com.retrofitsampleapplication.model.QuoteList
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface QuoteApi {

    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>

    
}