package com.schiavetti.interviewcodetasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.schiavetti.interviewcodetasks.codeacademy.CaesarCipher
import com.schiavetti.interviewcodetasks.codeacademy.LongestWord
import com.schiavetti.interviewcodetasks.codeacademy.NumberSteps

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Kfk: ${CaesarCipher.getEncodedMessage("z", 1)}")
    }
}
