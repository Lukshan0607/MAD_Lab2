package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity serves as the welcome or landing page of the application.
 * It provides a "Get Started" button to initiate the user onboarding process.
 */
class GetStartedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the XML layout for this activity.
        // You should have a layout file named 'activity_get_started.xml'.
        setContentView(R.layout.activity_get_started)

        // Find the "Get Started" button by its unique ID from the layout file.
        // Assuming your button's ID is 'getStartedButton'.
        val getStartedButton = findViewById<Button>(R.id.getStartedButton)

        // Set a listener for when the button is clicked.
        getStartedButton.setOnClickListener {
            // Create a new Intent to specify the destination activity.
            // This intent will navigate from GetStartedActivity to SignInActivity.
            val intent = Intent(this, SignInActivity::class.java)

            // Start the new activity.
            startActivity(intent)
        }
    }
}
