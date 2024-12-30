package com.example.dz16animation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView


class StartFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageIV = view.findViewById<ImageView>(R.id.iv_image)
        val startBtn = view.findViewById<Button>(R.id.btn_start)
        val fadeUpAnimation = AnimationUtils.loadAnimation(context, R.anim.fade)
        imageIV.startAnimation(fadeUpAnimation)
        val slideToRightAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_to_right)
        startBtn.startAnimation(slideToRightAnimation)
        startBtn.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.main, SignUpFragment())
                .commit()
        }
    }


}