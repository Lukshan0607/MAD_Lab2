package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.labgeethmi.R

/**
 * OnboardingOneActivity handles the first screen of the onboarding process.
 * It contains a button that navigates the user to the next onboarding screen.
 */
class OnboardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the first onboarding layout
        setContentView(R.layout.activity_onboarding_one)

        // Find the next button by its ID from the layout
        val nextButton = findViewById<Button>(R.id.nextButton)

        // Set an onClickListener on the button
        nextButton.setOnClickListener {
            // Create an Intent to start the OnboardingTwoActivity
            val intent = Intent(this, OnboardingTwoActivity::class.java)
            // Start the next activity
            startActivity(intent)
        }
    }
}
