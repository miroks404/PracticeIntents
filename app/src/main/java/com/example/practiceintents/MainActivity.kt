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
            intent.putExtra("NAME_KEY", binding.etName.getText().toString())
            startActivity(intent)
        }

        binding.bDate.setOnClickListener {
            val intent = Intent("com.example.practiceintents.SHOW_DATE")
            intent.putExtra("NAME_KEY", binding.etName.getText().toString())
            startActivity(intent)
        }

        binding.bEnterName.setOnClickListener {
            val intent = Intent(this@MainActivity, ThirdActivity::class.java)
            startActivityForResult(intent, 1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.let {
            binding.tvName.text = it.getStringExtra("NAME_KEY")
        }
    }
}