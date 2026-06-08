package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * ResourcesActivity displays the resources available in the app.
 * It handles navigation from the back button and the bottom bar.
 */
class ResourcesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resources)

        // Find the back button from the top bar.
        val backButton: ImageButton = findViewById(R.id.backButton)

        // Find the ImageButtons from the bottom bar.
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
            // We are already on the resources page, so no action is needed.
        }

        settingsIcon.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
