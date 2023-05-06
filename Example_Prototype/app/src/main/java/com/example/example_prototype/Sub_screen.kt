package com.example.example_prototype

import android.os.Bundle
import android.text.TextUtils.replace
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


class Sub_screen : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_sub_screen, container, false)
        val ChangeButton = v.findViewById<Button>(R.id.ss_main_bt)

        ChangeButton.setOnClickListener{
            childFragmentManager.commit{
                replace<Default_2>(R.id.ss_main_fcv)
                setReorderingAllowed(true)
                addToBackStack("name")
            }
        }


        return v
    }


}