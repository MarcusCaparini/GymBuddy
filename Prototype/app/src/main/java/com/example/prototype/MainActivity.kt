package com.example.prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        
        val Fmanager = supportFragmentManager

        val HomeBtn = findViewById<Button>(R.id.ms_home_bt)
        val CalBtn = findViewById<Button>(R.id.ms_cal_bt)
        val StatsBtn = findViewById<Button>(R.id.ms_stat_bt)


        HomeBtn.setOnClickListener{
            Fmanager.commit{
                replace<Home>(R.id.ms_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name") // name can be null
            }
        }

        CalBtn.setOnClickListener{
            Fmanager.commit{
                replace<Calendar_Lib>(R.id.ms_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name") // name can be null
            }
        }

        StatsBtn.setOnClickListener{
            Fmanager.commit{
                replace<ConfirmWorkout>(R.id.ms_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name") // name can be null
            }
        }
    }
}