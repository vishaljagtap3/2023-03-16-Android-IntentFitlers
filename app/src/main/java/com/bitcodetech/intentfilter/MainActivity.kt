package com.bitcodetech.intentfilter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.VmPolicy
import com.bitcodetech.intentfilter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         StrictMode.setVmPolicy( VmPolicy.Builder().build())

        binding.btnShow.setOnClickListener {
            val intent = Intent("com.bitcodetech.media.VIEW")
            intent.action = "com.bitcodetech.media.VIEW"
            intent.addCategory("com.bitcodetech.cat.GENERAL")
            //intent.putExtra("path", binding.edtPath.text.toString())
           /* intent.data = Uri.parse(binding.edtPath.text.toString())
            intent.type = "image/jpeg"*/
            intent.setDataAndType(
                Uri.parse(binding.edtPath.text.toString()),
                    "image/jpeg"
            )
            startActivity(intent)
        }
    }
}