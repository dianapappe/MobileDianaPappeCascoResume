package com.example.dianapappecascoresume.ui.experience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dianapappecascoresume.databinding.FragmentExperienceBinding

class ExperienceFragment : Fragment() {

    private var _binding: FragmentExperienceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val experienceViewModel =
            ViewModelProvider(this).get(ExperienceViewModel::class.java)

        _binding = FragmentExperienceBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textExperience
        experienceViewModel.text.observe(viewLifecycleOwner) {
           textView.text = it
        }


        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}