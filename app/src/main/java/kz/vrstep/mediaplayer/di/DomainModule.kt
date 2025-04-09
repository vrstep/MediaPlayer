package kz.vrstep.mediaplayer.di

import kz.vrstep.mediaplayer.domain.GetTracksUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetTracksUseCase(get()) }
}
