package com.aran.ocrapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aran.ocrapp.databinding.ActivitySecondStepBinding

class SecondStepActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondStepBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondStepBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}