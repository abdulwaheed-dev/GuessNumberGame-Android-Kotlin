package com.example.firstgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var userNum = findViewById<EditText>(R.id.editText)
        var message = findViewById<TextView>(R.id.textView)
        var btn = findViewById<Button>(R.id.button)
        var computerNum = findViewById<TextView>(R.id.textView2)

        var randNum = (1..100).random()

        btn.setOnClickListener(){
            var guessedNum = Integer.parseInt((userNum.text).toString())
//            var randNum = (1..100).random()
            if(guessedNum < randNum){
                message.setText("Your Guess was less than computer guess")
            }
            else if(guessedNum > randNum){
                message.setText("Your Guess was greater than computer guess")
            }
            else{
                message.setText("Wow! You Guessed Correct!")
            }
            computerNum.setText("PC guessed Number: "+randNum.toString())
        }

    }
}
