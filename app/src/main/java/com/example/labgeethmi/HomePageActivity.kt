package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * HomePageActivity serves as the main screen of the application after a user signs in.
 * This activity's layout displays the user's profile, mood entries, and a schedule,
 * and handles navigation to other parts of the application.
 */
class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the home page layout.
        setContentView(R.layout.activity_home_page)

        // Find the main clickable image for navigating to the AI chat.
        val homeImage = findViewById<ImageView>(R.id.homeImage1)

        // Find all the ImageButtons in the bottom navigation bar.
        val homeIcon = findViewById<ImageButton>(R.id.home_icon)
        val analyticsIcon = findViewById<ImageButton>(R.id.analytics_icon)
        val profileIcon = findViewById<ImageButton>(R.id.profile_icon)
        val resourcesIcon = findViewById<ImageButton>(R.id.resources_icon)
        val settingsIcon = findViewById<ImageButton>(R.id.settings_icon)

        // Set a click listener for 'homeImage1' to navigate to the chat activity.
        homeImage.setOnClickListener {
            // Create an Intent to start the AiTherapistChatActivity.
            val intent = Intent(this, AiTherapistChatActivity::class.java)
            startActivity(intent)
        }

        // Set click listeners for the bottom navigation icons to navigate.
        homeIcon.setOnClickListener {
            // The user is already on this page, so no navigation is needed.
            // You could add logic here to refresh the screen if required.
        }

        analyticsIcon.setOnClickListener {
            // Navigate to the AnalyticsActivity.
            val intent = Intent(this, AnalyticsActivity::class.java)
            startActivity(intent)
        }

        profileIcon.setOnClickListener {
            // Navigate to the ProfilePageActivity.
            val intent = Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
        }

        resourcesIcon.setOnClickListener {
            // Navigate to the ResourcesActivity.
            val intent = Intent(this, ResourcesActivity::class.java)
            startActivity(intent)
        }

        settingsIcon.setOnClickListener {
            // Navigate to the SettingsActivity.
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
