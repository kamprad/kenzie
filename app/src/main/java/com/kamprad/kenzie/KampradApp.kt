package com.kamprad.kenzie

import android.app.Activity
import android.app.Application
import com.facebook.stetho.Stetho
import com.kamprad.kenzie.di.AppInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class KampradApp : Application(), HasActivityInjector {
    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = dispatchingActivityInjector

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        AppInjector.init(this)
    }
}
