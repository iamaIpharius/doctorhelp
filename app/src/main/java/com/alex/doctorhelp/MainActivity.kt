package com.alex.doctorhelp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val outputTextView: TextView = findViewById(R.id.output_text_view)
        val nextLetterButton: Button = findViewById(R.id.alphabet_button)
        var coolAlphabetList = setAlphabet()


        nextLetterButton.setOnClickListener {
            if (coolAlphabetList.size > 0) {
                outputTextView.text = coolAlphabetList[0].toString()
                coolAlphabetList.removeAt(0)
            } else {
                coolAlphabetList = setAlphabet()
                outputTextView.text = coolAlphabetList[0].toString()
                coolAlphabetList.removeAt(0)
            }
        }


    }

    fun setAlphabet(): MutableList<Char> {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val alphabetList = mutableListOf<Char>()
        for ((index, value) in alphabet.withIndex()) {
            if (index % 2 != 0) {
                alphabetList.add(value)
            }

        }
        return alphabetList
    }
}