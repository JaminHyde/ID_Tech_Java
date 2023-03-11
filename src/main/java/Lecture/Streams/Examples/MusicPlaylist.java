package Lecture.Streams.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MusicPlaylist {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Bohemian Rhapsody", "Queen", 354));
        playlist.add(new Song("Stairway to Heaven", "Led Zeppelin", 480));
        playlist.add(new Song("November Rain", "Guns N' Roses", 537));
        playlist.add(new Song("Hotel California", "Eagles", 391));
        playlist.add(new Song("Sweet Child O' Mine", "Guns N' Roses", 355));
        playlist.add(new Song("Don't Stop Believin'", "Journey", 244));

        int maxDuration = 400;

        List<Song> shortSongs = playlist.stream()
                .filter(song -> song.getDuration() < maxDuration)
                .collect(Collectors.toList());

        System.out.println("Short songs in the playlist:");
        shortSongs.forEach(System.out::println);
    }
}

class Song {
    private String name;
    private String artist;
    private int duration;

    public Song(String name, String artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + " by " + artist + " (" + duration + "s)";
    }
}
