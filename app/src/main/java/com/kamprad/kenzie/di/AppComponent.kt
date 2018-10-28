package com.kamprad.kenzie.di

import android.app.Application
import com.kamprad.kenzie.KampradApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/** Entry point for dependency injection. Dagger will generate a component that will be able to inject
 *  dependencies into the android application class based on this, called DaggerAppComponent.
 *
 *  See: https://google.github.io/dagger/
 */
@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityModule::class, AppModule::class])
interface AppComponent {

    /**
     * AppComponent Builder.
     */
    @Component.Builder
    interface Builder {
        /**
         * Create new AppComponent builder.
         */
        @BindsInstance
        fun application(application: Application): Builder

        /**
         * Build new AppComponent.
         */
        fun build(): AppComponent
    }

    /**
     * Inject KampradApp dependency.
     */
    fun inject(app: KampradApp)
}
