package com.example.example_prototype

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Replace_screen : Fragment() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_replace_screen, container, false)
        val ReplacementButton = v.findViewById<Button>(R.id.rs_main_bt)
        val ParentFM = parentFragmentManager

        ReplacementButton.setOnClickListener{
            ParentFM.commit {
                replace<Default_2>(R.id.as_primary_fcv)
                setReorderingAllowed(true)
                addToBackStack("name")
            }
        }

        return v
    }


}