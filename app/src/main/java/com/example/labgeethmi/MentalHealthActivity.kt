package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * MentalHealthActivity displays a screen for mental health assessment.
 * This activity handles navigation to the next screen upon user interaction.
 */
class MentalHealthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the mental health layout.
        setContentView(R.layout.activity_mental_health)

        // Find the back button and set a click listener.
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            // Create an Intent to navigate back to the AgeSelectionActivity.
            val intent = Intent(this, AgeSelectionActivity::class.java)
            startActivity(intent)
            // Finish the current activity to remove it from the back stack.
            finish()
        }

        // Find the continue button.
        val continueButton = findViewById<Button>(R.id.continueButton)
        // Set a click listener to navigate to the StressLevelActivity.
        continueButton.setOnClickListener {
            val intent = Intent(this, StressLevelActivity::class.java)
            startActivity(intent)
            // Optional: Finish this activity so the user cannot navigate back to it.
            finish()
        }
    }
}
