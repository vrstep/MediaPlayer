package kz.vrstep.mediaplayer.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SongList() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(10) {
            ListItem(title = "Song $it", subtitle = "Artist $it", duration = "3:30")
        }
    }
}