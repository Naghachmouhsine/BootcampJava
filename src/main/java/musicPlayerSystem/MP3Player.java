package musicPlayerSystem;

class MP3Player extends AudioPlayer {
    private String fileName;

    public MP3Player(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 file: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3 file: " + fileName);
    }
}