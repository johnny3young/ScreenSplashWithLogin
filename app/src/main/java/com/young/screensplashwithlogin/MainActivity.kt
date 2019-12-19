package com.young.screensplashwithlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO crear una función tipocon algún Toast o Log.d para saber en qué activity estoy
        // whichActivity()


        var listaPaises = arrayOf("Colombia", "Venezuela", "Argentina", "Ecuador", "Brasil", "Perú", "Panamá", "Estados Unidos"
            , "Chile", "Uruguay", "Cuba", "Canadá", "México", "Jamaica")

        var adaptadorPaises: ListAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listaPaises)

        listview_item_mainactivity.adapter = adaptadorPaises

        btn_mainactivity.setOnClickListener {
            val mIntentMainActivity = Intent(this, SecondActivity::class.java)
            startActivity(mIntentMainActivity)
        }
    }
}
