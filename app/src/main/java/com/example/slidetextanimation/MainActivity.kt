package com.example.slidetextanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slidetextanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.root.setOnClickListener {
            binding.textView.slideUp(1000L, 0L)
        }

    }

}
