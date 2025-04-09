package kz.vrstep.mediaplayer.di

import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    single { androidContext().contentResolver }
    single { Dispatchers.IO }
}
