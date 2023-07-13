package com.example.superior

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


class CREATEACCOUNTActivity : AppCompatActivity() {

    lateinit var back1: TextView
    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var myconfpassword: EditText
    lateinit var signup: Button
    private lateinit var auth: FirebaseAuth // creating firebase authentification

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createaccountactivity)

        myemail = findViewById(R.id.email)
        mypassword = findViewById(R.id.password)
        myconfpassword = findViewById(R.id.confpassword)
        signup = findViewById(R.id.Register)
        auth = Firebase.auth

        back1 = findViewById(R.id.sin)

        back1.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        signup.setOnClickListener {
            SignUpUser()
        }
    }

    private fun SignUpUser() {
        val email = myemail.text.toString()
        val pass = mypassword.text.toString()
        val confirmpassword = myconfpassword.text.toString()
        if (email.isBlank() || pass.isBlank() || confirmpassword.isBlank()) {
            Toast.makeText(this, "Please Email and password can't be blank", Toast.LENGTH_LONG)
                .show()
            return

        } else if (pass != confirmpassword) {

            Toast.makeText(this, "password does not match", Toast.LENGTH_LONG).show()
            return
        }

        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Signed up successfully", Toast.LENGTH_LONG).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Failed to create", Toast.LENGTH_LONG).show()

            }

        }
    }
}