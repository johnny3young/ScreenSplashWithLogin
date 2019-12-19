package com.young.screensplashwithlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val cities = arrayOf("Medellin", "Bogotá", "Cali", "Manizales", "Bucaramanga", "La Guajira", "Pasto", "Tunja", "Barranquilla", "Cartagena")

        val adapterCities = ArrayAdapter(this,android.R.layout.simple_list_item_1,cities)

        listview_item_secondactivity.adapter = adapterCities

        btn_next_secondactiviy.setOnClickListener {
            val myIntentNextSecondActivity = Intent(this, ThirdActivity::class.java)
            startActivity(myIntentNextSecondActivity)
        }

        btn_back_secondactiviy.setOnClickListener {
            val myIntenBackSecondActivity = Intent (this, MainActivity::class.java)
            startActivity(myIntenBackSecondActivity)
        }
    }
}
