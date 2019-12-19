package com.young.screensplashwithlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        btn_next_thirdactivity.setOnClickListener {
            val mIntentNextThirdActivity = Intent(this,LoginActivity::class.java)
            startActivity(mIntentNextThirdActivity)
        }

        btn_back_thirdactivity.setOnClickListener {
            val myIntentBackThirdActivity = Intent(this, SecondActivity::class.java)
            startActivity(myIntentBackThirdActivity)
        }
    }
}
