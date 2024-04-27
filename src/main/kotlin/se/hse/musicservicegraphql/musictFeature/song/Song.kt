package se.hse.musicservicegraphql.musictFeature.song

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import se.hse.musicservicegraphql.musictFeature.playlist.Playlist

@Entity
@Table(name = "songs")
data class Song(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    val title: String,

    val artist: String,

    @Column(name = "playlist_id", insertable = false, updatable = false)
    var playlistId: Long?,

)