package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * StressLevelActivity allows the user to indicate their current stress level.
 * It handles navigation to the main application home page.
 */
class StressLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Make sure to use the correct layout file for this activity.
        setContentView(R.layout.activity_stress_level)

        // Find the back button and set a click listener to handle navigation.
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            // Create an Intent to navigate back to the MentalHealthActivity.
            val intent = Intent(this, MentalHealthActivity::class.java)
            startActivity(intent)
            // Finish the current activity to remove it from the back stack.
            finish()
        }

        // Find the continue button.
        val continueButton = findViewById<Button>(R.id.continueButton)
        // Set a click listener to navigate to the HomePageActivity.
        continueButton.setOnClickListener {
            // Create an intent to start the HomePageActivity.
            val intent = Intent(this, HomePageActivity::class.java)
            // Start the new activity.
            startActivity(intent)
            // Optional: Finish this activity so the user cannot navigate back to it.
            finish()
        }
    }
}
