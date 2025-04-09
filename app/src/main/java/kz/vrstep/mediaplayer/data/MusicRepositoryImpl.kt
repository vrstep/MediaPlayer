package kz.vrstep.mediaplayer.data

import kz.vrstep.mediaplayer.data.local.LocalMusicDataSource
import kz.vrstep.mediaplayer.data.remote.RemoteMusicDataSource
import kz.vrstep.mediaplayer.domain.Track

class MusicRepositoryImpl(
    private val remote: RemoteMusicDataSource,
    private val local: LocalMusicDataSource
) : MusicRepository {
    override suspend fun getAllTracks(): List<Track> {
        return remote.fetchRemoteTracks() + local.fetchLocalTracks()
    }
}
