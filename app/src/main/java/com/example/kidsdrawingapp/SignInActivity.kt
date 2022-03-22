package com.example.kidsdrawingapp

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

@Suppress("DEPRECATION")
class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        // This is used to hide the status bar and make the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // TODO (Step 8: Call the setup actionBar function.)
        //setupActionBar()

        btn_back_sign_in.setOnClickListener {

            // Launch the sign in screen.
            startActivity(Intent(this, IntroActivity::class.java))
        }

        btn_sign_in.setOnClickListener {

            // Launch the sign in screen.
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

    // TODO (Step 7: A function for setting up the actionBar.)
    /**
     * A function for actionBar Setup.
     */
    /*private fun setupActionBar() {

        setSupportActionBar(toolbar_sign_in_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }

        toolbar_sign_in_activity.setNavigationOnClickListener { onBackPressed() }
    }*/
}