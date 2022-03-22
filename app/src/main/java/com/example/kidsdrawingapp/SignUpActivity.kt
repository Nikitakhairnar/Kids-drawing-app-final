package com.example.kidsdrawingapp

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_up.*

// TODO (Step 1: Add the sign up activity.)
// START
@Suppress("DEPRECATION")
public class SignUpActivity : AppCompatActivity() {

    /**
     * This function is auto created by Android when the Activity Class is created.
     */

    private lateinit var mEmail:EditText
    private lateinit var mPass:EditText
    private lateinit var signUpBtn:Button
    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_sign_up)

        // This is used to hide the status bar and make the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        mEmail = findViewById(R.id.email_reg)
        mPass = findViewById(R.id.passreg)
        mTextView = findViewById(R.id.textView2)
        signUpBtn = findViewById(R.id.btn_sign_in)

        signUpBtn.setOnClickListener{
            createUser();
        }
        // TODO (Step 9: Call the setup actionBar function.)
        //setupActionBar()

        btn_back.setOnClickListener {

            // Launch the sign in screen.
            startActivity(Intent(this, IntroActivity::class.java))
        }
    }

    // TODO (Step 8: A function for setting up the actionBar.)
    /**
     * A function for actionBar Setup.
     */
    /*private fun setupActionBar() {

        setSupportActionBar(toolbar_sign_up_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }

        toolbar_sign_up_activity.setNavigationOnClickListener { onBackPressed() }*/
        private fun createUser(){

        }

}