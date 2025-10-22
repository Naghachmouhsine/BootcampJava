package musicPlayerSystem;

import java.util.ArrayList;
import java.util.List;

class MusicLibrary {
    private List<Playable> tracks = new ArrayList<>();

    public void addTrack(Playable track) {
        tracks.add(track);
    }
    
    public void playAll() {
        tracks.forEach(Playable::play);
    }

    public void stopAll() {
       tracks.forEach(Playable::stop);
    }

    public void pauseAll() {
        tracks.forEach(Playable::pause);
    }
}