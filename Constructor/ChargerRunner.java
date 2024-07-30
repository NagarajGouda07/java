class ChargerRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in ChargerRunner ");
	  
	  Charger charger=new Charger();
	  charger.name="iphone";
	  charger.colour="white";
	  System.out.println("Charger cost :"+charger.cost);
	  System.out.println("Charger name :"+charger.name);
	  System.out.println("Charger colour :"+charger.colour);
	  
	  
	   System.out.print("end main in ChargerRunner");
  }
 }