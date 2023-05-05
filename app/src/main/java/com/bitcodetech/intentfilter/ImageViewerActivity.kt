package com.bitcodetech.intentfilter

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitcodetech.intentfilter.databinding.ImageActivityBinding

class ImageViewerActivity : AppCompatActivity() {

    private lateinit var binding : ImageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.img.setImageURI(
            Uri.parse(intent.getStringExtra("path"))
        )
    }

}