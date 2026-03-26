class Media {
    private String fileName;
    private double size;
    private String format;

    
    Media(String fileName, double size, String format) {
        this.fileName = fileName;
        this.size = size;
        this.format = format;
    }

    
    void displayInfo() {
        System.out.println("File Name: " + fileName);
        System.out.println("Size: " + size + " MB");
        System.out.println("Format: " + format);
    }
}
