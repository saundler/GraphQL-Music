package se.hse.musicservicegraphql.musictFeature.playlist

import jakarta.persistence.*
import se.hse.musicservicegraphql.musictFeature.song.Song

@Entity
@Table(name = "playlists")
data class Playlist(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    val title: String,

    @Column(name="image_url")
    val imageUrl: String?,

    @OneToMany(mappedBy = "playlistId", fetch = FetchType.LAZY)
    var songs: MutableList<Song> = mutableListOf<Song>()
)
