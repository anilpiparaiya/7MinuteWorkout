package com.example.a7minuteworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fLStartButton:FrameLayout = findViewById(R.id.flStart)
        fLStartButton.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "From here we will start our android journey.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}