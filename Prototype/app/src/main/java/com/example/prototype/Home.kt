package com.example.prototype

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.prototype.R.id.ms_primary_fcv

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Home : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_home, container, false)

        val ms_fragmentManager = parentFragmentManager

        val Start_wrk = v.findViewById<Button>(R.id.hf_start_bt)
        val wrk_1 = v.findViewById<Button>(R.id.hf_wrk1_bt)
        val wrk_2 = v.findViewById<Button>(R.id.hf_wrk2_bt)
        val wrk_3 = v.findViewById<Button>(R.id.hf_wrk3_bt)
        val wrk_4 = v.findViewById<Button>(R.id.hf_wrk4_bt)

        // set onclick listeners for each button.

        Start_wrk.setOnClickListener{
            ms_fragmentManager.commit{
                replace<ConfirmWorkout>(ms_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name")
            }
        }

        wrk_1.setOnClickListener{
            ms_fragmentManager.commit{
                replace<DummyWorkout>(ms_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name1")
            }
        }
        wrk_2.setOnClickListener{
            ms_fragmentManager.commit{
                replace<DummyWorkout>(ms_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name2")
            }
        }
        wrk_3.setOnClickListener{
            ms_fragmentManager.commit{
                replace<DummyWorkout>(ms_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name3")
            }
        }
        wrk_4.setOnClickListener{
            ms_fragmentManager.commit{
                replace<DummyWorkout>(ms_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name4")
            }
        }

        return v
    }


}