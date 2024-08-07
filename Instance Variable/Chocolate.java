class Chocolate {
     String brand;
     double price;
     String flavour;
     String size;

    // Default constructor
    public Chocolate() {
        this.brand = "dairymilk";
        this.price = 0.0;
        this.flavour = "chocolate";
        this.size = "7";
    }

    // Parameterized constructor
    public Chocolate(String brand, double price, String flavour, String size) {
        this.brand = brand;
        this.price = price;
        this.flavour = flavour;
        this.size = size;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Flavour: " + flavour + ", Size: " + size);
    }
}
