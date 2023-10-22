package com.example.androidbundle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var namaEditText: EditText
    private lateinit var umurEditText: EditText
    private lateinit var nisEditText: EditText
    private lateinit var submitBtn: Button

    private val NAME_KEY: String = "nama"
    private val AGE_KEY: String = "umur"
    private val NIS_KEY: String = "nis"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEditText = findViewById(R.id.namaEdit)
        umurEditText = findViewById(R.id.umurEdit)
        nisEditText = findViewById(R.id.nisEdit)
        submitBtn = findViewById(R.id.sumbitBtn)

        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEditText.text.toString())
            intent.putExtra(AGE_KEY, umurEditText.text.toString())
            intent.putExtra(NIS_KEY, nisEditText.text.toString())
            startActivity(intent)
        }
    }
}