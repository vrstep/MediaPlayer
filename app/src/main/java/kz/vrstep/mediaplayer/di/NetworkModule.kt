package kz.vrstep.mediaplayer.di

import kz.vrstep.mediaplayer.data.remote.RemoteMusicDataSource
import kz.vrstep.mediaplayer.data.remote.api.MusicApiService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://api.music.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MusicApiService::class.java)
    }

    single { RemoteMusicDataSource(get()) }
}
