package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * OnboardingThreeActivity handles the third screen of the onboarding process.
 * This is the final onboarding screen before navigating to the "Get Started" page.
 */
class OnboardingThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the third onboarding layout
        setContentView(R.layout.activity_onboarding_three)

        // Find the next button by its ID
        val nextButton = findViewById<Button>(R.id.nextButton)

        // Set an onClickListener on the button
        nextButton.setOnClickListener {
            // Create an Intent to start the final GetStartedActivity
            val intent = Intent(this, GetStartedActivity::class.java)
            // Start the final activity
            startActivity(intent)
            // Finish this activity so the user can't navigate back to the onboarding screens
            finish()
        }
    }
}
