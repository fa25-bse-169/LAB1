class EducationalVideo extends Video {
    private String topic;
    private String teacher;

    
    EducationalVideo(String fileName, double size, String format,
                     int duration, String resolution,
                     String topic, String teacher) {

        super(fileName, size, format, duration, resolution);
        this.topic = topic;
        this.teacher = teacher;
    }

   
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Topic: " + topic);
        System.out.println("Teacher: " + teacher);
    }

    void calculateWatchTime() {
        System.out.println("You can watch this in 2 sittings.");
    }
}
