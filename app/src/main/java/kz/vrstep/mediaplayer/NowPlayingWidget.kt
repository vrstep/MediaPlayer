package com.example.mediaplayer

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.*
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import androidx.glance.appwidget.updateAll
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kz.vrstep.mediaplayer.R

class NowPlayingWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                NowPlayingWidgetContent()
            }
        }
    }
}

@Composable
fun NowPlayingWidgetContent() {
    Column(
        modifier = GlanceModifier.fillMaxSize().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Now Playing",
            style = TextStyle(color = ColorProvider(Color.White))
        )
        Text(
            text = "Song Title - Artist",
            style = TextStyle(color = ColorProvider(Color.LightGray))
        )
    }
}


fun updateNowPlayingWidget(context: Context) {
    MainScope().launch {
        NowPlayingWidget().updateAll(context)
    }
}
