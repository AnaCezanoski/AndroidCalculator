package com.android.calculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var resultNumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1EditText = findViewById(R.id.num1EditText)
        num2EditText = findViewById(R.id.num2EditText)
        resultNumber = findViewById(R.id.resultNumber)
    }

    fun add(view: View) {
        val val1 = num1EditText.text.toString().toInt()
        val val2 = num2EditText.text.toString().toInt()
        resultNumber.text = (val1 + val2).toString()
    }
    fun minus(view: View) {
        val val1 = num1EditText.text.toString().toInt()
        val val2 = num2EditText.text.toString().toInt()
        resultNumber.text = (val1 - val2).toString()
    }
    fun multi(view: View) {
        val val1 = num1EditText.text.toString().toInt()
        val val2 = num2EditText.text.toString().toInt()
        resultNumber.text = (val1 * val2).toString()
    }
    fun div(view: View) {
        val val1 = num1EditText.text.toString().toInt()
        val val2 = num2EditText.text.toString().toInt()
        resultNumber.text = (val1 / val2).toString()
    }
}
