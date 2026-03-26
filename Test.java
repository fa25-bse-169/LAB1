public class Test {
    public static void main(String[] args) {

        System.out.println("=== Media Object ===");
        Media m = new Media("file1", 10.5, "mp4");
        m.displayInfo();

        System.out.println("\n=== Video Object ===");
        Video v = new Video("movie", 20.0, "mp4", 60, "1080p");
        v.displayInfo();
        v.play();

        System.out.println("\n=== Educational Video Object ===");
        EducationalVideo e = new EducationalVideo(
                "lecture", 30.0, "mp4",
                90, "HD",
                "OOP Basics", "Sir Ali"
        );

        e.displayInfo();
        e.play();
        e.calculateWatchTime();
    }
}
