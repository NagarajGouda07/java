class Fish {
    String species;
    int size;

    Fish(String speciesName, int fishSize) {
        species = speciesName;
        size = fishSize;
		System.out.println("created fish using String,int");
		System.out.println("Species :" + species);
		System.out.println("Size :" + size);

    }
}

class Lamp {
    String type;
    int wattage;

    Lamp(String lampType, int lampWattage) {
        type = lampType;
        wattage = lampWattage;
		
		System.out.println("created lamp using String, int");
		System.out.println("Type :" + type);
		System.out.println("Wattage :" + wattage);
		}
}

class PrintingMachine {
    String brand;
    int speed;

    PrintingMachine(String machineBrand, int machineSpeed) {
        brand = machineBrand;
        speed = machineSpeed;
		
		System.out.println("created Printingmachine using String, int");
		System.out.println("Brand :" + brand);
		System.out.println("Speed ;" + speed);
    }
}

class Lens {
    String focalLength;
    String aperture;

    Lens(String lensFocalLength, String lensAperture) {
        focalLength = lensFocalLength;
        aperture = lensAperture;
		
		System.out.println("created Lens using String, String");
		System.out.println("FocalLength :" + focalLength);
		System.out.println("Aperture :" + aperture);
    }
}

class Coil {
    String material;
    int turns;

    Coil(String coilMaterial, int coilTurns) {
        material = coilMaterial;
        turns = coilTurns;
		
		System.out.println("created Lens using String, int");
		System.out.println("Material :" + material);
		System.out.println("Turns :" + turns);
		
    }
}


class Cap {
    String color;
    String size;
    String material;

    Cap(String capColor, String capSize, String capMaterial) {
        color = capColor;
        size = capSize;
        material = capMaterial;
		
		System.out.println("created cap using String, String, String");
		System.out.println("Color :" + color);
		System.out.println("Size :" + size);
		System.out.println("Material :" + material);
    }
}

class Gold {
    int purity;
    int weight;
    String type;

    Gold(int goldPurity, int goldWeight, String goldType) {
        purity = goldPurity;
        weight = goldWeight;
        type = goldType;
		
		System.out.println("created Gold using int, int, String");
		System.out.println("Purity :" + purity);
		System.out.println("Weight :" + weight);
		System.out.println("Type :" + type);
    }
}

class Board {
    String material;
    int length;
    int width;

    Board(String boardMaterial, int boardLength, int boardWidth) {
        material = boardMaterial;
        length = boardLength;
        width = boardWidth;
		
		System.out.println("created bord using String, int, int");
		System.out.println("Material :" + material);
		System.out.println("Length :" + length);
		System.out.println("Width :" + width);
    }
}

class Led {
    String color;
    int brightness;
    String type;

    Led(String ledColor, int ledBrightness, String ledType) {
        color = ledColor;
        brightness = ledBrightness;
        type = ledType;
		
		System.out.println("created Led using String, int, String");
		System.out.println("Color :" + color);
		System.out.println("Brightness :" + brightness);
		System.out.println("Type :" + type);
    }
}

class SimCard {
    String carrier;
    String phoneNumber;
    String plan;

    SimCard(String simCarrier, String simPhoneNumber, String simPlan) {
        carrier = simCarrier;
        phoneNumber = simPhoneNumber;
        plan = simPlan;
		
		System.out.println("created SimCard using String, String,String");
		System.out.println("Carrier :" + carrier);
		System.out.println("phoneNumber :" + phoneNumber);
		System.out.println("Plan :" + plan);
    }
}
