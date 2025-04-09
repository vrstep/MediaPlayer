package kz.vrstep.mediaplayer.di

import kz.vrstep.mediaplayer.viewmodel.PlayerViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { PlayerViewModel(get()) }
}
