class HotelRunner 
{
    public static void main(String[] args) 
	{
        Owner owner = new Owner("shashank", 45, "male");
        Hotel hotel = new Hotel("Ragavendra", owner);
        hotel.printDetails();

        
    }
}