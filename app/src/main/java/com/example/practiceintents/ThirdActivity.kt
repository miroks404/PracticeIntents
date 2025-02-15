package com.example.practiceintents

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practiceintents.databinding.ActivityThirdBinding


class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bOk.setOnClickListener {
            val intent = Intent()
            intent.putExtra("NAME_KEY", binding.etName.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}