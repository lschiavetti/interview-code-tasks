package com.schiavetti.interviewcodetasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.schiavetti.interviewcodetasks.exercism.DifferenceSquares
import com.schiavetti.interviewcodetasks.exercism.ScrabbleScore
import com.schiavetti.interviewcodetasks.exercism.SecretHandshake
import com.schiavetti.interviewcodetasks.exercism.TwoFer
import com.schiavetti.interviewcodetasks.kotlin.FoldStudy
import com.schiavetti.interviewcodetasks.kotlin.KotlinPractice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Tag", "Kfk:" + FoldStudy.runningFoldStudy())
    }
}
