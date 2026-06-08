package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    private lateinit var signInButton: Button
    private lateinit var signUpText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Find the sign-in button
        signInButton = findViewById(R.id.signInButton)

        // Find the "Don't have an account?" text
        signUpText = findViewById(R.id.noAccountText)

        // When Sign In button is clicked → move to HealthGoalActivity
        signInButton.setOnClickListener {
            val intent = Intent(this, HealthGoalActivity::class.java)
            startActivity(intent)
            finish()
        }

        // When "Sign Up" text is clicked → move to SignUpActivity
        signUpText.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
