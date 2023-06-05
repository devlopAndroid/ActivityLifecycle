package com.opentechspace.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "OnCreate Called", Toast.LENGTH_LONG).show()
        val textview = findViewById<TextView>(R.id.textView)
        textview.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
      Toast.makeText(applicationContext, "onRestart Called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
       Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume Called", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
    }

}
