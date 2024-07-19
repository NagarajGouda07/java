class Country 
{
    public static void states(String[] states_1)
	{
       
       for (int run = 0;run<states_1.length;run++) 
	   {
            String ref=states_1[run];
			System.out.println("state : "+ref);
		
        }
    }
	
	
	
	
     public static void pincode(int[] pin_code)
	 {
		 for (int pin = 0;pin<pin_code.length;pin++)
		 {
			 int ref = pin_code[pin];
		 System.out.println("Pincode : "+ref);
	 }
		 
	 }
	 
	 
	  public static void PoliticalParties(String[] Political_Parties)
	 {

		 for (int political=0;political<Political_Parties.length;political++)
		 {
		  String ref = Political_Parties[political];
		   System.out.println("PoliticalParty : "+ref);
	 }
	 }
	 
	 
	 
	 
	 public static void primeministers(String[] Prime_ministers)
	 {
		  for (int Prime=0;Prime<Prime_ministers.length;Prime++)
		 {
		  String ref = Prime_ministers[Prime];
		   System.out.println("Prime Minister : "+ref);
	 }
     }
	 
	 
	 
	  public static void cabinetMinisters(String[] cabinet_ministers)
	 {
		  for (int cabinet=0;cabinet<cabinet_ministers.length;cabinet++)
     {
		  String ref = cabinet_ministers[cabinet];
		   System.out.println("Cabinet Minister : "+ref);
	 }
	}
}



