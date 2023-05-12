package com.example.vibrantsshopapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeSettingsActivity : AppCompatActivity() {

    private lateinit var notificationCheckBox: CheckBox
    private lateinit var volumeSeekBar: SeekBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // Find views by their respective IDs
        val saveButton: Button = findViewById(R.id.saveButton)
        notificationCheckBox = findViewById(R.id.notificationCheckBox)
        volumeSeekBar = findViewById(R.id.volumeSeekBar)

        // Set click listener for the save button
        saveButton.setOnClickListener {
            saveSettings()
        }
    }

    private fun saveSettings() {
        val enableNotifications = notificationCheckBox.isChecked
        val volumeLevel = volumeSeekBar.progress

        // TODO: Save the settings to your app's preferences or database

        Toast.makeText(this, "Settings saved!", Toast.LENGTH_SHORT).show()
    }
}
