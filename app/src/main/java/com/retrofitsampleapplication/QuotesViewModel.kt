package com.retrofitsampleapplication

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.retrofitsampleapplication.respository.QuoteApi
import com.retrofitsampleapplication.respository.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch

class QuotesViewModel: ViewModel() {
    val quotesApi = RetrofitHelper.getInstance().create(QuoteApi::class.java)

    fun requestQuotesData(){
        viewModelScope.launch(Dispatchers.IO) {
            val result = quotesApi.getQuotes()
            if(result != null){
                Log.d("Response Body:", result.body().toString())
            }
        }
    }



}


