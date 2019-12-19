package com.young.screensplashwithlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        supportActionBar?.hide()


        //TODO hacer este TIMER una función para invocarla y dejar mas limpio el código
        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(this@IntroActivity, MainActivity::class.java))
                finish()
            }
        }, 5000) //5 seconds for pass to the Main Activity

    }
}
