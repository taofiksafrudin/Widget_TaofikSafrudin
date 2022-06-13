package com.example.widget_TaofikSafrudin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widget_TaofikSafrudin.databinding.ActivityLoginBinding

private lateinit var binding: ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inisialisasi binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {

            val dataLogin = ModelLogin(binding.textPUsername.text.toString(),binding.textPPassword.text.toString())
            val intent =Intent(this, MainActivity::class.java)
            intent.putExtra("data",dataLogin)
            startActivity(intent)
            finish()
        }

    }
}