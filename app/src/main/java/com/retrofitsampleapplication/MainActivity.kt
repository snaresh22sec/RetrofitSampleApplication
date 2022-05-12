package com.retrofitsampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.retrofitsampleapplication.respository.QuoteApi
import com.retrofitsampleapplication.respository.RetrofitHelper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivity : AppCompatActivity() {


    private val quotesViewModel: QuotesViewModel = ViewModelProvider(this).get(QuotesViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAPIRequest.setOnClickListener{
            quotesViewModel.requestQuotesData()
        }

    }



}