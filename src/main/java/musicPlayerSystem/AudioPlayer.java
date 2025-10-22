package musicPlayerSystem;

abstract class AudioPlayer implements Playable {
    protected int volume;

    public AudioPlayer() {
        this.volume = 50;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to: " + volume);
    }

    public int getVolume() {
        return volume;
    }
}