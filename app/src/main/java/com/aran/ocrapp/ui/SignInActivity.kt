package com.aran.ocrapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aran.ocrapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignIn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnToRegis.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}