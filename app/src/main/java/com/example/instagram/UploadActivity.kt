package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instagram.databinding.ActivityUploadBinding

class UploadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUploadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun upload(view: View) {}

    fun selectImage(view: View) {}
}