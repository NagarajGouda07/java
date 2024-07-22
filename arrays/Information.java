class Information{
	public static void states(String[] states){
		System.out.println("Running states in Info");
		int ref = states.length;
	
	for(int total=states.length-1;total>=0;total--){
		System.out.println("State"+" "+(total+1)+":" + states[total]);
	}
}

public static void pincode(int[] pincode){
	System.out.println("Running pincode in Info");
	int ref1 = pincode.length;
	System.out.println("No. of Pincodes"+ref1);
	
	for(int item=pincode.length-1;item>=0;item--){
		System.out.println("pincode"+" "+(item+1)+":"+pincode[item]);
		
	}
}

public static void primeminister(String[] primeminister){
	System.out.println("Running primeminister in Info");
	int ref2 = primeminister.length;
	System.out.println("No. of primeministers:"+ref2);
	
	for(int prime=primeminister.length-1;prime>=0;prime--){
		System.out.println("primeminister"+" "+(prime+1)+":"+primeminister[prime]);
	}
}

public static void politicalparty(String[] politicalparty){
	System.out.println("Running politicalparty in Info");
	int ref3 = politicalparty.length;
	System.out.println("No. of politicalparty:"+ref3);
	
	for(int i=politicalparty.length-1;i>=0;i--){
		System.out.println("politicalparty"+" "+(i+1)+":"+politicalparty[i]);
	}
}
}