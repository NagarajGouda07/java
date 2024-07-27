public class Buy1 {
    public static void product(String brand, double price) {
        if (price > 0) {
            System.out.println("Brand: " + brand);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Invalid price for product: " + brand);
        }
    }

    public static void product(String name, int quantity, String quality, double price) {
        if (quantity > 0 && price > 0) {
            System.out.println("Name: " + name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Quality: " + quality);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Invalid quantity or price for product: " + name);
        }
    }

    public static void bookMovieTicket(String name, String theaterName, int quantity, double price) {
        if (quantity > 0 && price > 0) {
            System.out.println("Movie: " + name);
            System.out.println("TheaterName: " + theaterName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Invalid quantity or price for movie ticket: " + name);
        }
    }

    public static void buyEgg(int total, double pricePerEgg) {
        if (total > 0 && pricePerEgg > 0) {
            System.out.println("Total: " + total);
            System.out.println("PricePerEgg: " + pricePerEgg);
        } else {
            System.out.println("Invalid total or price per egg");
        }
    }

    public static void buyShampoo(int quantityInMl, double price, String brand, String manfDate) {
        if (quantityInMl > 0 && price > 0) {
            System.out.println("QuantityInMl: " + quantityInMl);
            System.out.println("Price: " + price);
            System.out.println("Brand: " + brand);
            System.out.println("ManfDate: " + manfDate);
        } else {
            System.out.println("Invalid quantity or price for shampoo: " + brand);
        }
    }

    public static void buyCake(char size, String type, String flavour, double cost, int quantity) {
        if (cost > 0 && quantity > 0) {
            System.out.println("Size: " + size);
            System.out.println("Type: " + type);
            System.out.println("Flavour: " + flavour);
            System.out.println("Cost: " + cost);
            System.out.println("Quantity: " + quantity);
        } else {
            System.out.println("Invalid cost or quantity for cake: " + flavour);
        }
    }

    public static void buyLaptop(String brand, int serialNo, double price, int batteryCapacity, double screenSize, String os, int harddiskSize, int ramSize) {
        if (serialNo > 0 && price > 0 && batteryCapacity > 0 && screenSize > 0 && harddiskSize > 0 && ramSize > 0) {
            System.out.println("Brand: " + brand);
            System.out.println("SerialNo: " + serialNo);
            System.out.println("Price: " + price);
            System.out.println("BatteryCapacity: " + batteryCapacity);
            System.out.println("ScreenSize: " + screenSize);
            System.out.println("Os: " + os);
            System.out.println("HarddiskSize: " + harddiskSize);
            System.out.println("RamSize: " + ramSize);
        } else {
            System.out.println("Invalid laptop specifications for brand: " + brand);
        }
    }

    public static void buySmartWatch(String brand, double price, int color, char type, int mode) {
        if (price > 0 && color > 0 && mode > 0) {
            System.out.println("Brand: " + brand);
            System.out.println("Price: " + price);
            System.out.println("Color: " + color);
            System.out.println("Type: " + type);
            System.out.println("Mode: " + mode);
        } else {
            System.out.println("Invalid price, color or mode for smartwatch: " + brand);
        }
    }
}