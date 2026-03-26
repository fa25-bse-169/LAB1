public class EducationalVideo extends Video {
    private String topic;
    private String teacherName;

    public EducationalVideo(String fileName, double size, String format,
                            int duration, String resolution,
                            String topic, String teacherName) {
        super(fileName, size, format, duration, resolution);
        this.topic = topic;
        this.teacherName = teacherName;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Topic: " + topic);
        System.out.println("Teacher: " + teacherName);
    }

    public double calculateWatchTime() {
        return super.calculateWatchTime() * 1.1; // extra time for notes
    }

    public void takeQuiz() {
        System.out.println("Taking quiz for topic: " + topic);
    }

    public String toString() {
        return super.toString() + ", EducationalVideo[topic=" + topic + ", teacherName=" + teacherName + "]";
    }
}