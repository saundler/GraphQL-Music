package se.hse.musicservicegraphql.musictFeature.song

data class SongInput(
    val title: String,
    val artist: String,
    val playlistId: Long? = null
)
