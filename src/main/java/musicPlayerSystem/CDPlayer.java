package musicPlayerSystem;

class CDPlayer extends AudioPlayer {
    private String cdTitle;

    public CDPlayer(String cdTitle) {
        this.cdTitle = cdTitle;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + cdTitle);
    }

    @Override
    public void pause() {
        System.out.println("Pausing CD: " + cdTitle);
    }

    @Override
    public void stop() {
        System.out.println("Stopping CD: " + cdTitle);
    }
}