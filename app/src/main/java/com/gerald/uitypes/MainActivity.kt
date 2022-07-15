package com.gerald.uitypes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progressCircular : ProgressBar = findViewById(R.id.progressBarDuara)
        val progressHorizontal : ProgressBar =findViewById(R.id.progressBarLaini)
        val buttonStart : Button = findViewById(R.id.buttonStart)
        val buttonScroll : Button = findViewById(R.id.buttonScroll)

        buttonStart.setOnClickListener {
            if (progressCircular.visibility == View.VISIBLE
            ){
                progressCircular.visibility = View.GONE
                progressHorizontal.visibility=View.GONE
            }else{
                progressCircular.visibility = View.VISIBLE
                progressHorizontal.visibility =View.VISIBLE
            }
        }

        buttonScroll.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)


        }
    }
}