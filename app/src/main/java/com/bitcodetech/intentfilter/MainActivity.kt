package com.bitcodetech.intentfilter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitcodetech.intentfilter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShow.setOnClickListener {
            val intent = Intent("com.bitcodetech.media.VIEW")
            intent.action = "com.bitcodetech.media.VIEW"
            intent.addCategory("com.bitcodetech.cat.GENERAL")
            intent.putExtra("path", binding.edtPath.text.toString())
            startActivity(intent)
        }
    }
}