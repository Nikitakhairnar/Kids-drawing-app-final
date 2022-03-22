package com.example.kidsdrawingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_get_started.setOnClickListener {

            // Launch the sign in screen.
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}