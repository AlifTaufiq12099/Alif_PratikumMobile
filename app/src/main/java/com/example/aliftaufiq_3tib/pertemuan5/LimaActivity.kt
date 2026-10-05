package com.example.aliftaufiq_3tib.pertemuan5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aliftaufiq_3tib.R
import com.example.aliftaufiq_3tib.databinding.ActivityLimaBinding

class LimaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLimaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLimaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_lima)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
}