package kz.vrstep.mediaplayer

import android.app.Application
import kz.vrstep.mediaplayer.di.appModule
import kz.vrstep.mediaplayer.di.dataModule
import kz.vrstep.mediaplayer.di.domainModule
import kz.vrstep.mediaplayer.di.networkModule
import kz.vrstep.mediaplayer.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(
                appModule,
                networkModule,
                dataModule,
                domainModule,
                presentationModule
            )
        }
    }
}
