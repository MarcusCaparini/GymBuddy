package com.example.example_prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class ActiveScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.active_screen)



        //Set up the variables.
        val DefaultButton = findViewById<Button>(R.id.as_default_bt)
        val NestedButton = findViewById<Button>(R.id.as_nested_bt)
        val ReplacementButton = findViewById<Button>(R.id.as_replace_bt)

        val Fmanager = supportFragmentManager


        // The on-click listeners for each button.
        // They all do the same thing, just replacing with different screens.
        DefaultButton.setOnClickListener{
            Fmanager.commit{
                replace<Default_1>(R.id.as_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name") // name can be null
            }
        }

        NestedButton.setOnClickListener{
            Fmanager.commit{
                replace<Sub_screen>(R.id.as_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name") // name can be null
            }
        }

        ReplacementButton.setOnClickListener{
            Fmanager.commit{
                replace<Replace_screen>(R.id.as_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name") // name can be null
            }
        }

    }
}