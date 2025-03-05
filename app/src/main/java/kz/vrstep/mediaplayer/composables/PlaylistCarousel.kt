package kz.vrstep.mediaplayer.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PlaylistCarousel() {
    LazyColumn(modifier = Modifier.fillMaxWidth().height(200.dp)) {
        items(5) {
            Card(shape = RoundedCornerShape(8.dp), modifier = Modifier.padding(8.dp).fillMaxWidth()) {
                Text(text = "Playlist $it", modifier = Modifier.padding(16.dp))
            }
        }
    }
}