package com.example.practiceintents

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practiceintents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bTime.setOnClickListener {
            val intent = Intent("com.example.practiceintents.SHOW_TIME")
            startActivity(intent)
        }

        binding.bDate.setOnClickListener {
            val intent = Intent("com.example.practiceintents.SHOW_DATE")
            startActivity(intent);
        }
    }
}