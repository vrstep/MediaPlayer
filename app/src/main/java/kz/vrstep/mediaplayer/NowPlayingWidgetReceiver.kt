package kz.vrstep.mediaplayer

import androidx.glance.appwidget.GlanceAppWidgetReceiver
import com.example.mediaplayer.NowPlayingWidget

class NowPlayingWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget = NowPlayingWidget()
}