package com.uksoftware.weatherappuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class SplashScreenAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val intent = Intent(this, MainActivity::class.java)
        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(intent)
                finish()
            }
        }, 2000)



    }
}
