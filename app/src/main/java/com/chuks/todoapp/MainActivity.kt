package com.chuks.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val username="admin"
    val password = "admin"
   private lateinit var usernameInput : EditText
    private lateinit var passwordInput : EditText
    private lateinit var submitButton : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}