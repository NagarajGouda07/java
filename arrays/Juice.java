class Juice{
public static void juiceinfo(String name,String brand,String flavour,float price,int quantity)
{
	System.out.println("start juiceinfo in juice");
	
		System.out.println("Name :" + name);
		System.out.println("Brand :" + brand);
		System.out.println("Flavour :" + flavour);
		System.out.println("Price :" + price);
		System.out.println("Quantity :" + quantity);
		
		System.out.println("end juiceinfo in juice");
	
}
	public static void main (String[] args){
		System.out.println("start main in JuiceRunner");
		if (args.length==5)
		{
			String name=args[0];
			String brand=args[1];
			String flavour=args[2];
			String price=args[3];
			String quantity=args[4];
			
			float convertedprice=Float.parseFloat(price);
			int convertedquantity=Integer.parseInt(quantity);
			Juice.juiceinfo(name,brand,flavour,convertedprice,convertedquantity);
		}
		else{
			System.out.println("4 argument are required");
			System.out.println("end main in JuiceRunner");
			
		} 
	} 
}