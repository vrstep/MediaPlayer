package kz.vrstep.mediaplayer.composables

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MusicNote
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp

@Composable
fun SplashScreen() {
    var alphaState by remember { mutableStateOf(0f) }
    val animatedAlpha by animateFloatAsState(targetValue = alphaState, animationSpec = tween(1000))

    LaunchedEffect(Unit) {
        alphaState = 1f
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Icon(
            imageVector = Icons.Rounded.MusicNote,
            contentDescription = "App Logo",
            modifier = Modifier.size(100.dp).alpha(animatedAlpha)
        )
    }
}