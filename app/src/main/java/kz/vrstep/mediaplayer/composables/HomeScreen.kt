package kz.vrstep.mediaplayer.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    Column {
        PlaylistCarousel()
        SongList()
    }
}