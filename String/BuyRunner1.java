public class BuyRunner1 {
    public static void main(String[] args) {
        Buy1.product("Lee", 500);
        Buy1.product("Lee", -200);
        Buy1.product("Mobile", 5, "Good", 20000);
        Buy1.product("Mobile", -4, "Good", 1000);
        Buy1.bookMovieTicket("Kalki", "PVR", 2, 300);
        Buy1.bookMovieTicket("Kalki", "PVR", -1, 300);
        Buy1.buyEgg(10, 60);
        Buy1.buyEgg(5, -60);
        Buy1.buyShampoo(200, 60.00, "Dove", "16 Dec 2023");
        Buy1.buyShampoo(400, -60.00, "Dove", "16 Feb 2025");
        Buy1.buyCake('M', "drycake", "strawberry", 450, 2);
        Buy1.buyCake('M', "drycake", "strawberry", 450, -2);
        Buy1.buyLaptop("Samsung", 58796, 59000, 90, 55, "Windows", 500, 250);
        Buy1.buyLaptop("Samsung", -58796, 59000, 90, 55, "Windows", 500, 250);
        Buy1.buySmartWatch("Fastrack", 6000, 1, 'L', 1);
        Buy1.buySmartWatch("Fastrack", 6000, 2, 'L', 1);
    }
}