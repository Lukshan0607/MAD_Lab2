package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * AnalyticsActivity displays user's performance and analytics data.
 * It also handles navigation from the back button and the bottom bar.
 */
class AnalyticsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analytics)

        // Find the back button from the top bar
        val backButton: ImageButton = findViewById(R.id.backButton)

        // Find the ImageButtons from the footer
        val homeIcon: ImageButton = findViewById(R.id.home_icon)
        val analyticsIcon: ImageButton = findViewById(R.id.analytics_icon)
        val profileIcon: ImageButton = findViewById(R.id.profile_icon)
        val resourcesIcon: ImageButton = findViewById(R.id.resources_icon)
        val settingsIcon: ImageButton = findViewById(R.id.settings_icon)

        // Set up the click listener for the back button
        backButton.setOnClickListener {
            // Closes the current activity and returns to the previous one
            finish()
        }

        // Set up the click listeners for the bottom navigation bar
        homeIcon.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }

        analyticsIcon.setOnClickListener {
            // We are already on the analytics page, so no action is needed.
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
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
