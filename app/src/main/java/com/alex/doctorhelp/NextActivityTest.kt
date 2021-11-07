package com.alex.doctorhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NextActivityTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_test)


        val fab: FloatingActionButton = findViewById(R.id.floating_action_button)
        val nextActIntent: Intent = Intent(this, practice_6_7_november::class.java)



        fab.setOnClickListener {
            startActivity(nextActIntent)
        }
    }
}