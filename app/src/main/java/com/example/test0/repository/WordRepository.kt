package com.example.test0.repository

import com.example.test0.entity.Word
import com.example.test0.entity.ReviewPlan

object WordRepository {
    val wordList = mutableListOf<Word>()
    val planList = mutableListOf<ReviewPlan>()
    private var autoId = 1L

    fun addWord(english:String, explain:String, remark:String=""):Word{
        val w = Word(id=autoId++, english=english, explain=explain, remark=remark)
        wordList.add(w)
        return w
    }
    fun addPlan(plan:ReviewPlan){
        planList.add(plan)
    }
}