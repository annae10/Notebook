package com.ann.noteapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.ann.noteapp.R
import com.ann.noteapp.model.Note
import com.ann.noteapp.utils.ViewModelProviderFactory
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_add.*
import javax.inject.Inject

class AddFragment:DaggerFragment() {

    lateinit var noteViewModel: NoteViewModel

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewModel()

        btnAdd.setOnClickListener {
            Navigation.findNavController(requireActivity(),R.id.container).popBackStack()
        }
    }



    override fun onDestroyView() {
        saveNoteToDatabase()
        super.onDestroyView()
    }

    private fun saveNoteToDatabase() {

        val note = Note(0, addTitle.text.toString(), addDescription.text.toString(), addStatus.text.toString())

        if (addTitle.text.isNullOrEmpty()){
            note.title = "Empty Title"
            noteViewModel.insert(note)
            }else{
            noteViewModel.insert(note)
            }
    }

    private fun setUpViewModel() {
        noteViewModel = ViewModelProvider(this, viewModelProviderFactory).get(NoteViewModel::class.java)
    }
}