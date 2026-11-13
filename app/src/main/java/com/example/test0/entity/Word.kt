package com.example.test0.entity

data class Word(
    val id: Long = 0,
    val english: String,
    val explain: String,
    val remark: String = "",
    val createTime: Long = System.currentTimeMillis()
)