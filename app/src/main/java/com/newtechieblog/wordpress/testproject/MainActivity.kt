package com.newtechieblog.wordpress.testproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOne: Button = findViewById(R.id.button_one)
        buttonOne.setOnClickListener { buttonPressed(buttonOne) }
        val buttonTwo: Button = findViewById(R.id.button_two)
        buttonTwo.setOnClickListener { buttonPressed(buttonTwo) }
        val buttonThree: Button = findViewById(R.id.button_three)
        buttonThree.setOnClickListener { buttonPressed(buttonThree) }
        val buttonFour: Button = findViewById(R.id.button_four)
        buttonFour.setOnClickListener { buttonPressed(buttonFour) }
    }

    private fun buttonPressed(button: Button) {
        val format = SimpleDateFormat("dd/MM/yyyy KK:mm aa", Locale.getDefault())
        val timestamp = format.format(Date())

        val intent = Intent(this, EventsActivity::class.java)
        intent.putExtra("buttonTag", button.tag.toString())
        intent.putExtra("timestamp", timestamp)
        startActivity(intent)

        Log.d("Button", "Button ${button.tag} Pressed")
        Log.d("Timestamp", timestamp)

    }
}