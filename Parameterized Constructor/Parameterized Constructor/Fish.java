// Fish Class
class Fish {
    String name;
    String size;

    Fish(String name, String size) {
        System.out.println("created fish");
        System.out.println("name: " + name);
        System.out.println("size: " + size);
    }
}

// Lamp Class
class Lamp {
    String type;
    int wattage;

    Lamp(String type, int wattage) {
        System.out.println("created lamp");
        System.out.println("type: " + type);
        System.out.println("wattage: " + wattage);
    }
}

// PrintingMachine Class
class PrintingMachine {
    String model;
    int speed;

    PrintingMachine(String model, int speed) {
        System.out.println("created printing machine");
        System.out.println("model: " + model);
        System.out.println("speed: " + speed);
    }
}

// Lens Class
class Lens {
    String focalLength;
    String aperture;

    Lens(String focalLength, String aperture) {
        System.out.println("created lens");
        System.out.println("focalLength: " + focalLength);
        System.out.println("aperture: " + aperture);
    }
}

// Coil Class
class Coil {
    int turns;
    double inductance;

    Coil(int turns, double inductance) {
        System.out.println("created coil");
        System.out.println("turns: " + turns);
        System.out.println("inductance: " + inductance);
    }
}

// Cap Class
class Cap {
    String color;
    String size;
    String material;

    Cap(String color, String size, String material) {
        System.out.println("created cap");
        System.out.println("color: " + color);
        System.out.println("size: " + size);
        System.out.println("material: " + material);
    }
}

// Gold Class
class Gold {
    double weight;
    int karat;
    String form;

    Gold(double weight, int karat, String form) {
        System.out.println("created gold");
        System.out.println("weight: " + weight);
        System.out.println("karat: " + karat);
        System.out.println("form: " + form);
    }
}

// Board Class
class Board {
    String type;
    double length;
    double width;

    Board(String type, double length, double width) {
        System.out.println("created board");
        System.out.println("type: " + type);
        System.out.println("length: " + length);
        System.out.println("width: " + width);
    }
}

// Led Class
class Led {
    String color;
    int brightness;
    int voltage;

    Led(String color, int brightness, int voltage) {
        System.out.println("created led");
        System.out.println("color: " + color);
        System.out.println("brightness: " + brightness);
        System.out.println("voltage: " + voltage);
    }
}

// SimCard Class
class SimCard {
    String carrier;
    String number;
    String plan;

    SimCard(String carrier, String number, String plan) {
        System.out.println("created sim card");
        System.out.println("carrier: " + carrier);
        System.out.println("number: " + number);
        System.out.println("plan: " + plan);
    }
}