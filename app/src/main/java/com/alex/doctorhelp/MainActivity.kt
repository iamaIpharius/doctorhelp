package com.alex.doctorhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private const val TAG = "строчка"
private var flag: Int = 0


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val outputTextView: TextView = findViewById(R.id.output_text_view)
        val nextLetterButton: Button = findViewById(R.id.alphabet_button)
        var coolAlphabetList = setAlphabet()

        val nextActButton: Button = findViewById(R.id.next_activity_button)
        val nextActIntent: Intent = Intent(this, NextActivityTest::class.java)

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

        nextActButton.setOnClickListener {
            startActivity(nextActIntent)

        }


        if (flag == 0) {
            Log.d(TAG, "Ты видел деву на скале")

        }
        else {
            Log.d(TAG, "И ветер бился и летал")

        }


    }

    override fun onStart() {
        super.onStart()
        if (flag == 0) {
            Log.d(TAG, "В одежде белой над волнами")

        }
        else {
            Log.d(TAG, "С ее летучим покрывалом?")

        }

    }

    override fun onResume() {
        super.onResume()
        if (flag == 0) {
            Log.d(TAG, "Когда, бушуя в бурной мгле,")

        }
        else {
            Log.d(TAG, "Прекрасно море в бурной мгле")

        }
    }

    override fun onPause() {
        super.onPause()
        if (flag == 0) {
            Log.d(TAG, "Играло море с берегами,")

        }
        else {
            Log.d(TAG, "И небо в блесках без лазури;")

        }
    }

    override fun onStop() {
        super.onStop()
        if (flag == 0) {
            Log.d(TAG, "Когда луч молний озарял")

        }
        else {
            Log.d(TAG, "Но верь мне: дева на скале")

        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        if (flag == 0) {
            Log.d(TAG, "Ее всечасно блеском алым")
            flag = 1
        }
        else {
            Log.d(TAG, "Прекрасней волн, небес и бури.")
            flag = 0
        }
    }


//    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
//        super.onSaveInstanceState(outState, outPersistentState)
//        Log.d(TAG, "onSaveInstanceState")
//    }

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