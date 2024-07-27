class Train
{
    public static void book(String source,String destination)
    {
	 System.out.println("                                                                                   ");
	 System.out.println("Method having two Parameters :");
     System.out.println("Source is "+source);
	 System.out.println("Destination is "+destination);

    }
	public static void book(String source,String destination,int quantity)
    {
	 System.out.println("                                                                                   ");
	 System.out.println("Method having three Parameters :");
     System.out.println("Source is "+source);
	 System.out.println("Destination is "+destination);
	 System.out.println("Quantity is "+quantity);
	}
	public static void book(String source,String destination,int quantity,double price)
    {
	 System.out.println("                                                                                   ");
	 System.out.println("Method having four Parameters :");
     System.out.println("Source is "+source);
	 System.out.println("Destination is "+destination);
	 System.out.println("Quantity is "+quantity);
	 System.out.println("Price is "+price);
	}
	public static void cancel(int ticketNo)
	{
	 System.out.println("                                                                                   ");
	 System.out.println("Method having one Parameters :");
	 System.out.println("Ticket No is "+ticketNo);
	}
	public static void cancel(String source,String destination)
	{
	 System.out.println("                                                                                   ");
     System.out.println("Method having two Parameters :");
	 System.out.println("Source is "+source);
	 System.out.println("Destination is "+destination);
    }
	
}
