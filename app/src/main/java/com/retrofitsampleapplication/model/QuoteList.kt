package com.retrofitsampleapplication.model

data class QuoteList(
    val count: Int,
    val lastIndex: Int,
    val page: Int,
    val results: List<Results>,
    val totalCount: Int,
    val totalPage: Int
)
