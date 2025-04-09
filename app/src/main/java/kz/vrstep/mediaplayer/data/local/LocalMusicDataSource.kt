package kz.vrstep.mediaplayer.data.local

import android.content.ContentResolver
import kz.vrstep.mediaplayer.domain.Track

class LocalMusicDataSource(
    private val contentResolver: ContentResolver
) {
    fun fetchLocalTracks(): List<Track> {
        // Stubbed empty list; you can use contentResolver later with MediaStore
        return emptyList()
    }
}