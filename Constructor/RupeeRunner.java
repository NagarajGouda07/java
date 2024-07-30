class RupeeRunner {
    public static void main(String[] args) {
       
        Rupee rupee = new Rupee();
        AirCondition airCondition = new AirCondition();
        Autorikshaw autorikshaw = new Autorikshaw();
        AutoDriver autoDriver = new AutoDriver();
        Rapido rapido = new Rapido();
        CabCompany cabCompany = new CabCompany();
        BMTC bmtc = new BMTC();
        FoodDeliveryCompany foodDeliveryCompany = new FoodDeliveryCompany();

     
        System.out.println("Rupee - Value: " + rupee.value + ", Currency: " + rupee.currency + ", IsCoin: " + rupee.isCoin);
        System.out.println("AirCondition - Brand: " + airCondition.brand + ", Capacity: " + airCondition.capacity + ", IsInverter: " + airCondition.isInverter);
        System.out.println("Autorikshaw - Type: " + autorikshaw.type + ", NumberOfWheels: " + autorikshaw.numberOfWheels + ", IsElectric: " + autorikshaw.isElectric);
        System.out.println("AutoDriver - Name: " + autoDriver.name + ", Experience: " + autoDriver.experience + ", HasLicense: " + autoDriver.hasLicense);
        System.out.println("Rapido - VehicleType: " + rapido.vehicleType + ", Rating: " + rapido.rating + ", IsAvailable: " + rapido.isAvailable);
        System.out.println("CabCompany - CompanyName: " + cabCompany.companyName + ", NumberOfCabs: " + cabCompany.numberOfCabs + ", IsOperational: " + cabCompany.isOperational);
        System.out.println("BMTC - Route: " + bmtc.route + ", NumberOfBuses: " + bmtc.numberOfBuses + ", IsUnderMaintenance: " + bmtc.isUnderMaintenance);
        System.out.println("FoodDeliveryCompany - Name: " + foodDeliveryCompany.name + ", DeliveryRadius: " + foodDeliveryCompany.deliveryRadius + ", HasApp: " + foodDeliveryCompany.hasApp);

      
        Matrimony matrimony = new Matrimony();
        matrimony.serviceType = "Traditional";
        matrimony.numberOfMembers = 5000;
        matrimony.isPaidService = true;
        System.out.println("Matrimony - ServiceType: " + matrimony.serviceType + ", NumberOfMembers: " + matrimony.numberOfMembers + ", IsPaidService: " + matrimony.isPaidService);

        Application application = new Application();
        application.appName = "WeatherApp";
        application.developer = "DevCorp";
        application.isPaid = false;
        System.out.println("Application - AppName: " + application.appName + ", Developer: " + application.developer + ", IsPaid: " + application.isPaid);

        Fruit fruit = new Fruit();
        fruit.name = "Apple";
        fruit.color = "Red";
        fruit.isTropical = false;
        System.out.println("Fruit - Name: " + fruit.name + ", Color: " + fruit.color + ", IsTropical: " + fruit.isTropical);

        Juice juice = new Juice();
        juice.flavor = "Orange";
        juice.isFresh = true;
        juice.quantity = 500;
        System.out.println("Juice - Flavor: " + juice.flavor + ", IsFresh: " + juice.isFresh + ", Quantity: " + juice.quantity);

        Place place = new Place();
        place.city = "Paris";
        place.population = 2148000;
        place.isTouristSpot = true;
        System.out.println("Place - City: " + place.city + ", Population: " + place.population + ", IsTouristSpot: " + place.isTouristSpot);

        AlcoholBrand alcoholBrand = new AlcoholBrand();
        alcoholBrand.brandName = "Smirnoff";
        alcoholBrand.alcoholContent = 40;
        alcoholBrand.isImported = true;
        System.out.println("AlcoholBrand - BrandName: " + alcoholBrand.brandName + ", AlcoholContent: " + alcoholBrand.alcoholContent + ", IsImported: " + alcoholBrand.isImported);

        Candy candy = new Candy();
        candy.flavor = "Strawberry";
        candy.quantity = 20;
        candy.isSugarFree = false;
        System.out.println("Candy - Flavor: " + candy.flavor + ", Quantity: " + candy.quantity + ", IsSugarFree: " + candy.isSugarFree);

        Medicine medicine = new Medicine();
        medicine.name = "Paracetamol";
        medicine.type = "Tablet";
        medicine.isPrescriptionRequired = false;
        System.out.println("Medicine - Name: " + medicine.name + ", Type: " + medicine.type + ", IsPrescriptionRequired: " + medicine.isPrescriptionRequired);

        Food food = new Food();
        food.name = "Pasta";
        food.cuisine = "Italian";
        food.isVegetarian = true;
        System.out.println("Food - Name: " + food.name + ", Cuisine: " + food.cuisine + ", IsVegetarian: " + food.isVegetarian);
    }
}
