package com.bembos.bembosapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionBar = supportActionBar
        actionBar?.hide()

        val registrar = findViewById<Button>(R.id.btnIngresar)
        registrar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}