package com.example.practiceintents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practiceintents.databinding.ActivitySecondBinding
import java.text.SimpleDateFormat
import java.util.Date

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var timeFormat: String

        binding.tvDateOrTime.text = intent?.action?.let {
            when (it) {
                "com.example.practiceintents.SHOW_TIME" -> {
                    timeFormat = "HH:mm:ss"
                    "Time: ${SimpleDateFormat(timeFormat).format(Date(System.currentTimeMillis()))}"
                }

                "com.example.practiceintents.SHOW_DATE" -> {
                    timeFormat = "dd.MM.yyyy"
                    "Date: ${SimpleDateFormat(timeFormat).format(Date(System.currentTimeMillis()))}"
                }

                else -> "Error"
            }
        }

        binding.tvName.text = intent.getStringExtra("NAME_KEY")

    }
}