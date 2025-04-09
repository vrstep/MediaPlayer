package kz.vrstep.mediaplayer.data.remote

import kz.vrstep.mediaplayer.data.remote.api.MusicApiService
import kz.vrstep.mediaplayer.domain.Track

class RemoteMusicDataSource(
    private val api: MusicApiService
) {
    suspend fun fetchRemoteTracks(): List<Track> {
        // Stubbed empty list
        return emptyList()
    }
}
