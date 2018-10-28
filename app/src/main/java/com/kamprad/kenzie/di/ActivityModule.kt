package com.kamprad.kenzie.di

import com.kamprad.kenzie.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * This provides injector for the activity
 * See: https://google.github.io/dagger/android.
 *
 */
@Suppress("unused")
@Module
interface ActivityModule {

    /**
     * Provides injector for MainActivity and define it's modules.
     */
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    fun contributeMainActivityInjector(): MainActivity
}
