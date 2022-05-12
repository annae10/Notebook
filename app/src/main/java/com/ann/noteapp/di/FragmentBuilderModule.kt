package com.ann.noteapp.di

import com.ann.noteapp.ui.AddFragment
import com.ann.noteapp.ui.EditFragment
import com.ann.noteapp.ui.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeAddFragment():AddFragment

    @ContributesAndroidInjector
    abstract fun contributeEditFragment(): EditFragment

    @ContributesAndroidInjector
    abstract fun contributeListFragment(): ListFragment
}