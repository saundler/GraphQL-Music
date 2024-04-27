package se.hse.musicservicegraphql.musictFeature.playlist

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class PlaylistController(private val playlistRepository: PlaylistRepository) {

    @QueryMapping
    fun playlists(): List<Playlist> {
        println("DEBUG: Select all playlists from DB")
        return playlistRepository.findAll()
    }

}