package com.taurunium.notetakingapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import com.taurunium.notetakingapp.R
import com.taurunium.notetakingapp.adapter.NoteAdapter
import com.taurunium.notetakingapp.databinding.FragmentHomeBinding
import com.taurunium.notetakingapp.viewmodel.NoteViewModel


class HomeFragment : Fragment(), SearchView.OnQueryTextListener {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var notesViewModel :NoteViewModel
    private lateinit var noteAdaper:NoteAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}