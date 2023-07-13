package com.example.superior

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase



class LoginActivity : AppCompatActivity() {
    lateinit var back2: TextView
    private lateinit var myemail: EditText
    private lateinit var mypassword: EditText
    lateinit var login1: Button
    private lateinit var auth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        back2 = findViewById(R.id.si)
        myemail = findViewById(R.id.email)
        mypassword = findViewById(R.id.password)
        login1 = findViewById(R.id.Register)
        auth = Firebase.auth



        back2.setOnClickListener {
            val intent = Intent(this, CREATEACCOUNTActivity::class.java)
            startActivity(intent)
            finish()
        }

        login1.setOnClickListener {
            login()
        }
    }

    private fun login() {
        val email = myemail.text.toString()
        val pass = mypassword.text.toString()

        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_LONG).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else
                Toast.makeText(this, "Log in failed", Toast.LENGTH_LONG).show()
        }
    }


    }
