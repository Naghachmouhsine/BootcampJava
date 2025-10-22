package musicPlayerSystem;

public class Main{
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        library.addTrack(new MP3Player("song1.mp3"));
        library.addTrack(new CDPlayer("Greatest Hits"));
        library.addTrack(new MP3Player("song2.mp3"));
        library.addTrack(new CDPlayer("Greatest Hits"));

        library.playAll();
        library.stopAll();
        library.pauseAll();
    }
}