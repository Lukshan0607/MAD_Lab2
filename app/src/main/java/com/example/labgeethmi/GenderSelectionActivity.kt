package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * GenderSelectionActivity allows the user to specify their gender.
 * It provides a list of options and navigates to the next activity upon confirmation.
 */
class GenderSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the gender selection layout.
        setContentView(R.layout.activity_gender_selection)

        // Find the back button and set a click listener.
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            // Create an Intent to navigate back to the HealthGoalActivity.
            val intent = Intent(this, HealthGoalActivity::class.java)
            startActivity(intent)
            // Finish the current activity to remove it from the back stack.
            finish()
        }

        // Find the continue button.
        val continueButton = findViewById<Button>(R.id.continueButton)
        // Set a click listener to handle the continue button action.
        continueButton.setOnClickListener {
            // Here, you would get the selected gender from the UI elements like a RadioGroup.
            // For now, we'll navigate to the AgeSelectionActivity.
            val intent = Intent(this, AgeSelectionActivity::class.java)
            startActivity(intent)
            // Optional: Finish this activity so the user cannot navigate back to it.
            finish()
        }
    }
}
