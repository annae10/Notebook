package com.ann.noteapp.di

import android.app.Application
import com.ann.noteapp.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class
    ]
)
interface AppComponent: AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{
        fun build():AppComponent

        @BindsInstance
        fun application(application:Application):Builder
    }
}