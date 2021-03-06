package com.aimerneige.huawu.jungang.ui.social

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.aimerneige.huawu.jungang.R
import com.aimerneige.huawu.jungang.ui.MainActivity
import com.allen.library.CircleImageView
import kotlinx.android.synthetic.main.fragment_social.*

class SocialFragment : Fragment() {

    private lateinit var socialViewModel: SocialViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        socialViewModel =
                ViewModelProviders.of(this).get(SocialViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_social, container, false)
//        val textView: TextView = root.findViewById(R.id.text_social)
//        socialViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        return root
    }
}