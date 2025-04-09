package kz.vrstep.mediaplayer.di

import kz.vrstep.mediaplayer.data.MusicRepository
import kz.vrstep.mediaplayer.data.MusicRepositoryImpl
import kz.vrstep.mediaplayer.data.local.LocalMusicDataSource
import org.koin.core.scope.get
import org.koin.dsl.module

val dataModule = module {
    single { LocalMusicDataSource(get()) } // get() provides ContentResolver from AppModule

    single<MusicRepository> {
        MusicRepositoryImpl(
            remote = get(),
            local = get()
        )
    }
}
