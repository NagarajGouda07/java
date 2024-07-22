class Pass2{
	public static void main(String[] args){
		System.out.println("Starting");
	
		if(args.length==4){
			System.out.println("4 refs are given now");
		String name = args[0];
		String location = args[1];
		String builtBy = args[2];
		String buildYear = args[3];
		
		System.out.println("name:"+name);
		System.out.println("location:"+location);
		System.out.println("builtBy:"+builtBy);
		System.out.println("buildYear:"+buildYear);
		}
		else{
			System.out.println("Need 4 refs");
		}
	}
	}
 