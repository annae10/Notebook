package com.ann.noteapp.di

import androidx.lifecycle.ViewModelProvider
import com.ann.noteapp.utils.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory):
            ViewModelProvider.Factory
}