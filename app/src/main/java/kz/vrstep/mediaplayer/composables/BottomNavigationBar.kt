package kz.vrstep.mediaplayer.composables

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.navigation.NavHostController
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.MusicNote
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar {
        val items = listOf(
            "home" to Icons.Rounded.Home,
            "search" to Icons.Rounded.Search,
            "music" to Icons.Rounded.MusicNote
        )
        var selectedScreen by remember { mutableStateOf("home") }

        items.forEach { (screen, icon) ->
            val isSelected = selectedScreen == screen
            val iconAlpha by animateFloatAsState(if (isSelected) 1f else 0.5f, animationSpec = tween(300))

            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    selectedScreen = screen
                    navController.navigate(screen)
                },
                icon = { Icon(imageVector = icon, contentDescription = screen, modifier = Modifier.alpha(iconAlpha)) },
                label = { Text(screen) }
            )
        }
    }
}
