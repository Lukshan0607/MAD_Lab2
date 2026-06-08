package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * SettingsActivity displays the application settings and preferences.
 * It handles navigation from the back button and the bottom bar.
 */
class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // Find the back button from the top bar.
        val backButton: ImageButton = findViewById(R.id.backButton)

        // Find the ImageButtons from the bottom bar. Note the ID for resources icon
        // has been updated to match your XML (`recources_icon`).
        val homeIcon: ImageButton = findViewById(R.id.home_icon)
        val analyticsIcon: ImageButton = findViewById(R.id.analytics_icon)
        val profileIcon: ImageButton = findViewById(R.id.profile_icon)
        val resourcesIcon: ImageButton = findViewById(R.id.recources_icon)
        val settingsIcon: ImageButton = findViewById(R.id.settings_icon)

        // Set up the click listener for the back button.
        backButton.setOnClickListener {
            // Closes the current activity and returns to the previous one.
            finish()
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
            val intent = Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
        }

        resourcesIcon.setOnClickListener {
            val intent = Intent(this, ResourcesActivity::class.java)
            startActivity(intent)
        }

        settingsIcon.setOnClickListener {
            // We are already on the settings page, so no action is needed.
        }
    }
}
