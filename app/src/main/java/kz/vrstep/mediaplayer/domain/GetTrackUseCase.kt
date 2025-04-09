package kz.vrstep.mediaplayer.domain

import kz.vrstep.mediaplayer.data.MusicRepository

class GetTracksUseCase(private val repository: MusicRepository) {
    suspend operator fun invoke(): List<Track> = repository.getAllTracks()
}
