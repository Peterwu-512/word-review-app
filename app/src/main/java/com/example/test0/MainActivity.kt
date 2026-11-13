package com.example.test0

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test0.entity.ReviewPlan
import com.example.test0.repository.WordRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 测试：添加单词+复习计划
        val testWord = WordRepository.addWord("hello","你好")
        val fiveMinLater = System.currentTimeMillis() + 5 * 60 * 1000
        val plan = ReviewPlan(wordId = testWord.id, stage = 0, nextReviewTime = fiveMinLater)
        WordRepository.addPlan(plan)
        Log.d("TEST_MEM","添加单词成功：${testWord.english} ${testWord.explain}")
    }
}