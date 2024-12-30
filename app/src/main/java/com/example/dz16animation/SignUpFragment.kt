package com.example.dz16animation

import android.view.View
import androidx.fragment.app.Fragment
import android.content.Intent
import android.os.Bundle

import android.view.LayoutInflater

import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class SignUpFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val signUpTV = view.findViewById<TextView>(R.id.tv_sign_up)
        val signUpLL = view.findViewById<LinearLayout>(R.id.ll_sign_up)
        val signUpBtn = view.findViewById<Button>(R.id.btn_sign_up)
        signUpTV.startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_to_down))
        signUpLL.startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_to_up))
        signUpBtn.setOnClickListener {
            startActivity(Intent(context, MainActivity::class.java))
            activity?.finish()
        }
    }

}