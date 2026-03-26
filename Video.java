class Video extends Media {
    private int duration;
    private String resolution;

 
    Video(String fileName, double size, String format, int duration, String resolution) {
        super(fileName, size, format);
        this.duration = duration;
        this.resolution = resolution;
    }

   
    void displayInfo() {
        super.displayInfo(); // show Media info first
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Resolution: " + resolution);
    }

    void play() {
        System.out.println("Playing video...");
    }

    void pause() {
        System.out.println("Video paused.");
    }
}
