package com.kamprad.kenzie.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kamprad.kenzie.ui.main.HomeViewModel
import com.kamprad.kenzie.utils.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Provides all of the ViewModel.
 *
 * As more viewModels are created it will be added here with @IntoMap annotation.
 * so that it will be provided to ViewModelFactory and be used in the fragments and activities.
 */
@Suppress("unused")
@Module
interface ViewModelModule {
    // IntoMap is a Dagger 2 multi-binding feature, for adding items into a Map.
    // See: https://google.github.io/dagger/multibindings
    /**
     * Provides HomeViewModel for usage in ViewModelFactory.
     */
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    fun bindSignInViewModel(homeViewModel: HomeViewModel): ViewModel

    /**
     * Provides ViewModel Factory.
     */
    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
