class Paper {
     double thickness;
     String size;
     String quality;
     String color;

    // Default constructor
    public Paper() {
        this.thickness = 0.0;
        this.size = "DefaultSize";
        this.quality = "DefaultQuality";
        this.color = "DefaultColor";
    }

    // Parameterized constructor
    public Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

    // Setter methods
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Thickness: " + thickness + ", Size: " + size + ", Quality: " + quality + ", Color: " + color);
    }
}
