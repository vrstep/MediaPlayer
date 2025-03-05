package kz.vrstep.mediaplayer.composables

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

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar {
        val items = listOf(
            "home" to Icons.Rounded.Home,
            "search" to Icons.Rounded.Search,
            "music" to Icons.Rounded.MusicNote
        )
        items.forEach { (screen, icon) ->
            NavigationBarItem(
                selected = false,
                onClick = { navController.navigate(screen) },
                icon = { Icon(imageVector = icon, contentDescription = screen) },
                label = { Text(screen) }
            )
        }
    }
}
