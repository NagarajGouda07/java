class Pass1{
	public static void main(String[] args){
		System.out.println("Starting");
		
		if(args.length==4){
			System.out.println("4 refs are given now");
		String name = args[0];
		String area = args[1];
		String establishedYear = args[2];
		String state = args[3];
		
		System.out.println("name:"+name);
		System.out.println("area:"+area);
		System.out.println("establishedYear:"+establishedYear);
		System.out.println("state:"+state);
		}
		else{
			System.out.println("Need 4 refs");
		}
	}
	}
	