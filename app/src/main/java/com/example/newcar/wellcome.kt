package com.example.newcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class wellcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wellcome)
        Handler().postDelayed({
            val intent= Intent(wellcome@this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}