package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * OnboardingTwoActivity handles the second screen of the onboarding process.
 * Clicking the button on this screen navigates the user to the third screen.
 */
class OnboardingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the second onboarding layout
        setContentView(R.layout.activity_onboarding_two)

        // Find the next button by its ID
        val nextButton = findViewById<Button>(R.id.nextButton)

        // Set an onClickListener on the button
        nextButton.setOnClickListener {
            // Create an Intent to start the OnboardingThreeActivity
            val intent = Intent(this, OnboardingThreeActivity::class.java)
            // Start the next activity
            startActivity(intent)
        }
    }
}
