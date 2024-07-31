public class MainRunner {
    public static void main(String[] args) {
        // Fish Instances
        Fish fish1 = new Fish("anjal", "small");
        Fish fish2 = new Fish("gold", "large");
        Fish fish3 = new Fish("tuna", "medium");
        Fish fish4 = new Fish("salmon", "small");
        Fish fish5 = new Fish("trout", "large");
        Fish fish6 = new Fish("catfish", "medium");
        Fish fish7 = new Fish("mackerel", "small");
        Fish fish8 = new Fish("bass", "large");
        Fish fish9 = new Fish("haddock", "medium");
        Fish fish10 = new Fish("cod", "small");
        Fish fish11 = new Fish("sardine", "large");

        // Lamp Instances
        Lamp lamp1 = new Lamp("LED", 60);
        Lamp lamp2 = new Lamp("Incandescent", 100);
        Lamp lamp3 = new Lamp("Fluorescent", 40);
        Lamp lamp4 = new Lamp("Halogen", 75);
        Lamp lamp5 = new Lamp("CFL", 20);
        Lamp lamp6 = new Lamp("HID", 150);
        Lamp lamp7 = new Lamp("Neon", 30);
        Lamp lamp8 = new Lamp("Xenon", 50);
        Lamp lamp9 = new Lamp("Plasma", 80);
        Lamp lamp10 = new Lamp("OLED", 25);
        Lamp lamp11 = new Lamp("Laser", 90);

        // PrintingMachine Instances
        PrintingMachine pm1 = new PrintingMachine("ModelX", 500);
        PrintingMachine pm2 = new PrintingMachine("ModelY", 300);
        PrintingMachine pm3 = new PrintingMachine("ModelZ", 400);
        PrintingMachine pm4 = new PrintingMachine("ModelA", 350);
        PrintingMachine pm5 = new PrintingMachine("ModelB", 450);
        PrintingMachine pm6 = new PrintingMachine("ModelC", 600);
        PrintingMachine pm7 = new PrintingMachine("ModelD", 250);
        PrintingMachine pm8 = new PrintingMachine("ModelE", 700);
        PrintingMachine pm9 = new PrintingMachine("ModelF", 800);
        PrintingMachine pm10 = new PrintingMachine("ModelG", 550);
        PrintingMachine pm11 = new PrintingMachine("ModelH", 650);

        // Lens Instances
        Lens lens1 = new Lens("50mm", "f/1.8");
        Lens lens2 = new Lens("35mm", "f/2.0");
        Lens lens3 = new Lens("85mm", "f/1.4");
        Lens lens4 = new Lens("24mm", "f/2.8");
        Lens lens5 = new Lens("70mm", "f/2.8");
        Lens lens6 = new Lens("100mm", "f/2.8");
        Lens lens7 = new Lens("200mm", "f/2.8");
        Lens lens8 = new Lens("14mm", "f/2.8");
        Lens lens9 = new Lens("300mm", "f/4.0");
        Lens lens10 = new Lens("400mm", "f/2.8");
        Lens lens11 = new Lens("600mm", "f/4.0");

        // Coil Instances
        Coil coil1 = new Coil(100, 1.2);
        Coil coil2 = new Coil(200, 2.4);
        Coil coil3 = new Coil(150, 1.8);
        Coil coil4 = new Coil(180, 2.0);
        Coil coil5 = new Coil(220, 2.5);
        Coil coil6 = new Coil(140, 1.5);
        Coil coil7 = new Coil(160, 1.9);
        Coil coil8 = new Coil(210, 2.3);
        Coil coil9 = new Coil(130, 1.3);
        Coil coil10 = new Coil(170, 2.1);
        Coil coil11 = new Coil(190, 2.2);

        // Cap Instances
        Cap cap1 = new Cap("Red", "M", "Cotton");
        Cap cap2 = new Cap("Blue", "L", "Wool");
        Cap cap3 = new Cap("Green", "S", "Polyester");
        Cap cap4 = new Cap("Yellow", "M", "Nylon");
        Cap cap5 = new Cap("Black", "L", "Leather");
        Cap cap6 = new Cap("White", "M", "Silk");
        Cap cap7 = new Cap("Gray", "S", "Linen");
        Cap cap8 = new Cap("Brown", "L", "Canvas");
        Cap cap9 = new Cap("Purple", "M", "Felt");
        Cap cap10 = new Cap("Orange", "S", "Suede");
        Cap cap11 = new Cap("Pink", "L", "Denim");

        // Gold Instances
        Gold gold1 = new Gold(50.0, 24, "Bar");
        Gold gold2 = new Gold(20.0, 18, "Coin");
        Gold gold3 = new Gold(30.0, 22, "Ingot");
        Gold gold4 = new Gold(10.0, 24, "Nugget");
        Gold gold5 = new Gold(40.0, 14, "Jewelry");
        Gold gold6 = new Gold(25.0, 18, "Flake");
        Gold gold7 = new Gold(35.0, 22, "Dust");
        Gold gold8 = new Gold(15.0, 24, "Foil");
        Gold gold9 = new Gold(45.0, 14, "Bead");
        Gold gold10 = new Gold(55.0, 18, "Sheet");
        Gold gold11 = new Gold(60.0, 22, "Wire");

        // Board Instances
        Board board1 = new Board("Plywood", 4.0, 8.0);
        Board board2 = new Board("Particle Board", 3.0, 6.0);
        Board board3 = new Board("Fiberboard", 2.5, 5.0);
        Board board4 = new Board("Chipboard", 4.5, 9.0);
        Board board5 = new Board("Hardboard", 3.5, 7.0);
        Board board6 = new Board("OSB", 5.0, 10.0);
        Board board7 = new Board("MDF", 3.2, 6.4);
        Board board8 = new Board("HDF", 4.8, 9.6);
        Board board9 = new Board("Veneer", 2.8, 5.6);
        Board board10 = new Board("Laminated Board", 5.5, 11.0);
        Board board11 = new Board("Blockboard", 6.0, 12.0);

        // Led Instances
        Led led1 = new Led("White", 500, 12);
        Led led2 = new Led("Red", 300, 10);
        Led led3 = new Led("Blue", 400, 15);
        Led led4 = new Led("Green", 350, 9);
        Led led5 = new Led("Yellow", 450, 20);
        Led led6 = new Led("Purple", 600, 18);
        Led led7 = new Led("Orange", 250, 8);
        Led led8 = new Led("Pink", 550, 22);
        Led led9 = new Led("Cyan", 380, 11);
        Led led10 = new Led("Magenta", 470, 16);
        Led led11 = new Led("Amber", 520, 14);

        // SimCard Instances
        SimCard simCard1 = new SimCard("AT&T", "123-456-7890", "Unlimited");
        SimCard simCard2 = new SimCard("Verizon", "098-765-4321", "Prepaid");
        SimCard simCard3 = new SimCard("T-Mobile", "111-222-3333", "Postpaid");
        SimCard simCard4 = new SimCard("Sprint", "444-555-6666", "Unlimited");
        SimCard simCard5 = new SimCard("MetroPCS", "777-888-9999", "Pay-as-you-go");
        SimCard simCard6 = new SimCard("Boost Mobile", "123-123-1234", "Family Plan");
        SimCard simCard7 = new SimCard("Cricket", "321-321-4321", "Monthly");
        SimCard simCard8 = new SimCard("US Cellular", "555-666-7777", "Annual");
        SimCard simCard9 = new SimCard("Virgin Mobile", "888-999-0000", "Monthly");
        SimCard simCard10 = new SimCard("Straight Talk", "112-233-4455", "Weekly");
        SimCard simCard11 = new SimCard("Google Fi", "667-788-8990", "Flexible");
    }
}