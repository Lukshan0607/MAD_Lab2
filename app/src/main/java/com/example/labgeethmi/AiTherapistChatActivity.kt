package com.example.labgeethmi

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * AiTherapistChatActivity is the main screen for the AI Therapist chat feature.
 * It provides different interaction modes (Speech-to-Speech, Text-to-Text, etc.)
 * and handles navigation based on the user's selection.
 */
class AiTherapistChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_therapist_chat)

        // Find the UI elements by their IDs.
        val backButton: ImageButton = findViewById(R.id.backButton)
        val speechS: FrameLayout = findViewById(R.id.speechS)


        // Set up the click listener for the back button.
        backButton.setOnClickListener {
            // Closes the current activity and returns to the previous one.
            finish()
        }

        // Set up the click listener for the "Speech to Speech" option.
        speechS.setOnClickListener {
            val intent = Intent(this, SpeechToSpeechActivity::class.java)
            startActivity(intent)
        }
    }
}
