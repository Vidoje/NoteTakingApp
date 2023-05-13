package com.taurunium.notetakingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taurunium.notetakingapp.viewmodel.NoteViewModel

class MainActivity : AppCompatActivity() {

    lateinit var noteViewModel: NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}