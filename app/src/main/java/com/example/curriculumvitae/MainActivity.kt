package com.example.curriculumvitae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.curriculumvitae.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding :  ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConoceme.setOnClickListener{

            val intent = Intent(this, MeetMeActivity::class.java)
            startActivity(intent)

        }

    }
}