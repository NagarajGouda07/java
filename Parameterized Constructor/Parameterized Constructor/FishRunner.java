class FishRunner {
    public static void main(String[] args) {
        Fish fish1 = new Fish("Salmon", 15);
        Fish fish2 = new Fish("Tuna", 10);
        Lamp lamp1 = new Lamp("LED", 60);
        Lamp lamp2 = new Lamp("Halogen", 75);
        PrintingMachine machine1 = new PrintingMachine("HP", 30);
        PrintingMachine machine2 = new PrintingMachine("Canon", 25);
        Lens lens1 = new Lens("50mm", "f/1.8");
        Lens lens2 = new Lens("35mm", "f/1.4");
        Coil coil1 = new Coil("Copper", 200);
        Coil coil2 = new Coil("Aluminum", 150);

        Cap cap1 = new Cap("Red", "M", "Cotton");
        Cap cap2 = new Cap("Blue", "L", "Wool");
        Gold gold1 = new Gold(24, 100, "Necklace");
        Gold gold2 = new Gold(18, 50, "Ring");
        Board board1 = new Board("Wood", 200, 100);
        Board board2 = new Board("Plastic", 150, 80);
        Led led1 = new Led("Red", 1000, "SMD");
        Led led2 = new Led("Blue", 1500, "COB");
        SimCard simCard1 = new SimCard("Verizon", "1234567890", "Unlimited");
        SimCard simCard2 = new SimCard("AT&T", "0987654321", "Prepaid");

    }
}
