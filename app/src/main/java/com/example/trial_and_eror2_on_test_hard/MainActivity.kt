package com.example.trial_and_eror2_on_test_hard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler()
            .postDelayed(
                {
                    startActivity(Intent(this, problempage::class.java))
                    finish()
                }, SPLASH_TIME_OUT
            )
    }
}