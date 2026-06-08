package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * ProfilePageActivity displays the user's profile information and provides navigation
 * to other sections of the app. It also handles the logout functionality.
 */
class ProfilePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        // Find the UI elements by their IDs.
        val backButton: ImageButton = findViewById(R.id.backButton)
        val logoutButton: Button = findViewById(R.id.logoutButton)

        // Find the ImageButtons for the bottom navigation bar.
        val homeIcon: ImageButton = findViewById(R.id.home_icon)
        val analyticsIcon: ImageButton = findViewById(R.id.analytics_icon)
        val profileIcon: ImageButton = findViewById(R.id.profile_icon)
        val resourcesIcon: ImageButton = findViewById(R.id.resources_icon)
        val settingsIcon: ImageButton = findViewById(R.id.settings_icon)

        // Set up the click listener for the back button to navigate back.
        backButton.setOnClickListener {
            finish()
        }

        // Set up the click listener for the logout button.
        logoutButton.setOnClickListener {
            // Create an Intent to navigate to the SignInActivity.
            val intent = Intent(this, SignInActivity::class.java)
            // Clear the activity stack so the user cannot navigate back to the profile page.
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        // Set up the click listeners for the bottom navigation bar.
        homeIcon.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }

        analyticsIcon.setOnClickListener {
            val intent = Intent(this, AnalyticsActivity::class.java)
            startActivity(intent)
        }

        profileIcon.setOnClickListener {
            // We are already on the profile page, so no action is needed.
        }

        resourcesIcon.setOnClickListener {
            val intent = Intent(this, ResourcesActivity::class.java)
            startActivity(intent)
        }

        settingsIcon.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
