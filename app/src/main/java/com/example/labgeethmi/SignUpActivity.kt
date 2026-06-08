package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var signUpButton: Button
    private lateinit var alreadyAccountText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Find views
        signUpButton = findViewById(R.id.signUpButton)
        alreadyAccountText = findViewById(R.id.alreadyAccountText)

        // After successful sign-up → go to HealthGoalActivity
        signUpButton.setOnClickListener {
            val intent = Intent(this, HealthGoalActivity::class.java)
            startActivity(intent)
            finish()
        }

        // If user already has an account → go back to SignInActivity
        alreadyAccountText.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
