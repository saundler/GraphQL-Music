package se.hse.musicservicegraphql.musictFeature.playlist

import org.springframework.data.jpa.repository.JpaRepository

interface PlaylistRepository: JpaRepository<Playlist, Long> {
}