package com.kamprad.kenzie.di

import com.kamprad.kenzie.ui.main.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * This Provides the injector for fragments
 * See: https://google.github.io/dagger/android
 */
@Suppress("unused")
@Module
interface FragmentModule {

    /**
     * Provides injector for SignIn fragment.
     */
    @Suppress("FunctionMaxLength")
    @ContributesAndroidInjector
    fun contributeHomeFragmentInjector(): HomeFragment
}
