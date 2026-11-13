package com.example.test0.entity

data class ReviewPlan(
    val rid: Long = 0,
    val wordId: Long,
    val stage: Int = 0,
    val nextReviewTime: Long,
    val lastReviewTime: Long = System.currentTimeMillis()
)