package com.example.kotlin_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kotlin_android.views.ListViewActivity

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        val c1=findViewById<Button>(R.id.button1)
        c1.setOnClickListener {
            startActivity(Intent(this, ListViewActivity::class.java))
        }
    }
}