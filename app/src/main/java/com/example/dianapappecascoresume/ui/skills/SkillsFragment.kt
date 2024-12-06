package com.example.dianapappecascoresume.ui.skills

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dianapappecascoresume.databinding.FragmentSkillsBinding


class SkillsFragment : Fragment() {

    private var _binding: FragmentSkillsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val skillsViewModel =
            ViewModelProvider(this).get(SkillsViewModel::class.java)

        _binding = FragmentSkillsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSkills
        skillsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}