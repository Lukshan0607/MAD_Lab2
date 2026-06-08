package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * HealthGoalActivity allows the user to select their primary health goal.
 * It provides a list of options and now navigates to the GenderSelectionActivity.
 */
class HealthGoalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the health goal layout.
        setContentView(R.layout.activity_health_goal)

        // Find the back button and set a click listener.
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            // Finish this activity to go back to the previous one (e.g., SignInActivity).
            finish()
        }

        // Find the continue button.
        val continueButton = findViewById<Button>(R.id.continueButton)
        // Set a click listener to handle the continue button action.
        continueButton.setOnClickListener {
            // Create an Intent to start the new activity, which is now GenderSelectionActivity.
            val intent = Intent(this, GenderSelectionActivity::class.java)
            startActivity(intent)
            // Optional: Finish this activity so the user cannot navigate back to it
            // by pressing the back button from the gender selection page.
            finish()
        }
    }
}
