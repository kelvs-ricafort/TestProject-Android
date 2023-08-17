package com.newtechieblog.wordpress.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EventsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        val actionBar = supportActionBar
        actionBar!!.title = "Events Activity"
        // Set back button
        actionBar.setDisplayHomeAsUpEnabled(true)

        val textViewButtonPressed: TextView = findViewById(R.id.textView_buttonPressed)
        val textViewEventbuttonPressed: TextView = findViewById(R.id.event_buttonPressed)

        val buttonTag = intent.getStringExtra("buttonTag")
        val timestamp = intent.getStringExtra("timestamp")

        textViewButtonPressed.text = getString(R.string.button_pressed, buttonTag)
        textViewEventbuttonPressed.text = "$timestamp"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}