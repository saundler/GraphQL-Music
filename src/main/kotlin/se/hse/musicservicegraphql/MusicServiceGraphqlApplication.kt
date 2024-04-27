package se.hse.musicservicegraphql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MusicServiceGraphqlApplication

fun main(args: Array<String>) {
	runApplication<MusicServiceGraphqlApplication>(*args)
}
