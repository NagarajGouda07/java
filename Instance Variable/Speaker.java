class Speaker {
     String brand;
     String size;
     double cost;
     int output;

    // Default constructor
    public Speaker() {
        this.brand = "BWC";
        this.size = "large";
        this.cost = 0.0;
        this.output = 0;
    }

    // Parameterized constructor
    public Speaker(String brand, String size, double cost, int output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Brand: " + brand + ", Size: " + size + ", Cost: " + cost + ", Output: " + output);
    }
}