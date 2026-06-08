package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * AgeSelectionActivity allows the user to specify their age.
 * It provides UI for age selection and navigates to the next activity upon confirmation.
 */
class AgeSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_selection)

        // Find the back button and set a click listener.
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            // Create an Intent to navigate back to the GenderSelectionActivity.
            val intent = Intent(this, GenderSelectionActivity::class.java)
            startActivity(intent)
            // Optional: Finish this activity to remove it from the back stack.
            finish()
        }

        // Find the continue button.
        val continueButton = findViewById<Button>(R.id.continueButton)
        // Set a click listener to navigate to the MentalHealthActivity.
        continueButton.setOnClickListener {
            val intent = Intent(this, MentalHealthActivity::class.java)
            startActivity(intent)
            // Optional: Finish this activity so the user cannot navigate back to it.
            finish()
        }
    }
}
