package kz.vrstep.mediaplayer.data

import kz.vrstep.mediaplayer.domain.Track

interface MusicRepository {
    suspend fun getAllTracks(): List<Track>
}
