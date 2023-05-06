package com.example.example_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up the elements we're going to use.
        val display = findViewById<TextView>(R.id.am_greeting_tv)
        val TextInputBox = findViewById<EditText>(R.id.am_name_ti)
        val SubmitButton = findViewById<Button>(R.id.am_submit_bt)
        val ForwardButton = findViewById<Button>(R.id.am_forward_bt)

        // string variable
        var username = ""

        SubmitButton.setOnClickListener{
            username = TextInputBox.text.toString()
            if(username != ""){
                // Make the button appear and the change the text.
                ForwardButton.alpha = 1.0f
                display.text = "Hello $username!"
                TextInputBox.text.clear()

                // Allow the forward button to work when clicked.
                ForwardButton.setOnClickListener{
                    val intent = Intent(this, ActiveScreen::class.java)
                    startActivity(intent)
                }

            }


        }


















    }
}