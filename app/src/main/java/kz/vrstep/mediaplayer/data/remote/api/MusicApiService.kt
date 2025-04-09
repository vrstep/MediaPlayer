package kz.vrstep.mediaplayer.data.remote.api

import retrofit2.http.GET


interface MusicApiService {
    @GET("tracks")
    suspend fun getTracks(): List<Any> // Replace Any with your actual DTO later
}