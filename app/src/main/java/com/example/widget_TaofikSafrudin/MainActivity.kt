package com.example.widget_TaofikSafrudin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widget_TaofikSafrudin.databinding.ActivityMainBinding

//Membuat variable binding
private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        val getData = intent.getParcelableExtra<ModelLogin>("data")
        binding.txtUsername.text = getData?.username.toString()
        binding.txtPassword.text = getData?.password.toString()

        //Explicite Intent memanggil activity di project yang sama
        binding.btnWidget.setOnClickListener {
            val intent = Intent(this,Widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicite.setOnClickListener {
            val intent = Intent(this,ImplicitIntent::class.java)
            startActivity(intent)

        }
    }
}