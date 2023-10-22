package com.example.androidbundle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var namaView: TextView
    private lateinit var umurView: TextView
    private lateinit var nisView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        namaView = findViewById(R.id.namaView)
        umurView = findViewById(R.id.umurView)
        nisView = findViewById(R.id.nisView)

        val extras = intent.extras

        namaView.text = extras?.getString("nama")
        umurView.text = extras?.getString("umur")
        nisView.text = extras?.getString("nis")

    }
}