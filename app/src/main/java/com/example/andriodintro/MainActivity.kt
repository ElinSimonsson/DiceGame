package com.example.andriodintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var inputView : EditText
    lateinit var imageView: ImageView
    var image = R.drawable.d1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGenerate = findViewById<Button>(R.id.generateButton)
        textView = findViewById(R.id.textView)
        inputView = findViewById(R.id.inputView)
        imageView = findViewById(R.id.imageView)


    }


    fun buttonPressed (view : View){
        Log.d("!!!","Knappen trycks")

        val input = inputView.text.toString()
        var diceSides = input.toInt()


        val number = (0..diceSides).random()
        //textView.text = number.toString()

        image = when (number) {
           1 -> R.drawable.d1
           2 -> R.drawable.d2
           3 -> R.drawable.d3
           4 -> R.drawable.d4
           5 -> R.drawable.d5
           else -> R.drawable.d6
        }
        imageView.setImageResource(image)




    }

}
