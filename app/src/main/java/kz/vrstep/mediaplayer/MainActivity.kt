package kz.vrstep.mediaplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import kz.vrstep.mediaplayer.composables.BottomNavigationBar
import kz.vrstep.mediaplayer.composables.NavigationGraph
import kz.vrstep.mediaplayer.composables.SplashScreen
import kz.vrstep.mediaplayer.ui.theme.MediaPlayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediaPlayerTheme {
                var showSplash by remember { mutableStateOf(true) }

                LaunchedEffect(Unit) {
                    delay(1000)
                    showSplash = false
                }

                if (showSplash) {
                    SplashScreen()
                } else {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = { BottomNavigationBar(navController) }
                    ) { paddingValues ->
                        Box(modifier = Modifier.padding(paddingValues)) {
                            NavigationGraph(navController)
                        }
                    }
                }
            }
        }
    }
}
