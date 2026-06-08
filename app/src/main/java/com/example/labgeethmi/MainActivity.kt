package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity serves as the splash screen for the application.
 * It displays the main layout for 3 seconds before automatically
 * navigating to the OnboardingOneActivity.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the splash screen layout
        setContentView(R.layout.activity_main)

        // Use a Handler to delay the navigation for 3 seconds (3000 milliseconds)
        Handler(Looper.getMainLooper()).postDelayed({
            // Create an Intent to start the next activity in the flow
            val intent = Intent(this, OnboardingOneActivity::class.java)
            // Start the OnboardingOneActivity
            startActivity(intent)
            // Finish this activity so the user cannot navigate back to the splash screen
            finish()
        }, 3000) // 3000ms = 3 seconds
    }
}
