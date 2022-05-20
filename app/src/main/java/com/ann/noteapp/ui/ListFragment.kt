package com.ann.noteapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ann.noteapp.R
import com.ann.noteapp.utils.ViewModelProviderFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class ListFragment: DaggerFragment()  {

    @Inject
    lateinit var viewmodelFactory: ViewModelProviderFactory

    lateinit var noteViewModel: NoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViewModel()
        initRecyclerView()
        observerLiveData()
    }

    private fun observerLiveData() {
        TODO("Not yet implemented")
    }

    private fun initRecyclerView() {

    }

    private fun setupViewModel() {
        noteViewModel = ViewModelProvider(this,viewmodelFactory).get(NoteViewModel::class.java)
    }
}