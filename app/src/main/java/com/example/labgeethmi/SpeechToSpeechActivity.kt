package com.example.labgeethmi

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

/**
 * SpeechToSpeechActivity is responsible for handling the speech-to-speech
 * interaction with the AI Therapist.
 */
class SpeechToSpeechActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speech_to_speech)

        // Find the back button from the layout.
        val backButton: ImageButton = findViewById(R.id.backButton)

        // Set up a click listener for the back button.
        backButton.setOnClickListener {
            // Finish the current activity to navigate back to the previous screen.
            finish()
        }

        // Additional logic for handling speech-to-speech functionality would go here.
        // This includes setting up voice recognition, text-to-speech engines,
        // and handling the interaction flow.
    }
}
