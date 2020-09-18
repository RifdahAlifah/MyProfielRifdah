package com.rifdahalf.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cover.*

class Cover : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cover)

        btnProfile.setOnClickListener {
            val intent = Intent (this, DetailProfil :: class.java)
            startActivity(intent)
        }
    }
}