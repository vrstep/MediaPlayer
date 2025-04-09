package kz.vrstep.mediaplayer.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kz.vrstep.mediaplayer.domain.GetTracksUseCase
import kz.vrstep.mediaplayer.domain.Track

class PlayerViewModel(
    private val getTracksUseCase: GetTracksUseCase
) : ViewModel() {

    private val _tracks = MutableStateFlow<List<Track>>(emptyList())
    val tracks: StateFlow<List<Track>> = _tracks.asStateFlow()

    init {
        viewModelScope.launch {
            _tracks.value = getTracksUseCase()
        }
    }
}
