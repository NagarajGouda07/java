class CountryRunner
{
public static void main(String[] args)
{
	 String[] states1 = {
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", 
            "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", 
            "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", 
            "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"
        };
		Country.states(states1);
	
	
	
			 int[] pincode ={560063,515081,588401,580056,500001,543201,568055,534423,516322,547567};
              Country.pincode(pincode);
			 

			 
      String[] parties = {"JDS", "BJP", "Indian National Congress", "Bharatiya Janata Party", "Aam Aadmi Party"};
			  Country.PoliticalParties(parties);
			


			
	  String[] ministers = {"Jawaharlal Nehru", "Lal Bahadur Shastri", "Indira Gandhi", 
            "Morarji Desai", "Charan Singh", "Rajiv Gandhi", 
            "Vishwanath Pratap Singh", "Chandra Shekhar", "P. V. Narasimha Rao", 
            "Atal Bihari Vajpayee", "H. D. Deve Gowda", "I. K. Gujral", 
            "Manmohan Singh", "Narendra Modi"};
            Country.primeministers( ministers);
		

		
      String[] cabinetMinisters = {
            "Shri Raj Nath Singh","Shri Amit Shah","Shri Nitin Jairam Gadkari","Shri Jagat Prakash Nadda","Shri Shivraj Singh Chouhan",
	        "Smt. Nirmala Sitharaman","Dr. Subrahmanyam Jaishankar","Shri Manohar Lal","Shri H. D. Kumaraswamy","Shri Piyush Goyal",
	        "Shri Dharmendra Pradhan","Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh alias Lalan Singh","Shri Sarbananda Sonowal",
	        "Shri Chirag Paswan","Shri C R Patil",
	        "Dr. Virendra Kumar","Shri Kinjarapu Rammohan Naidu","Shri Pralhad Joshi","Shri Jual Oram","Shri Giriraj Singh",
	        "Shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Gajendra Singh Shekhawat","Smt. Annpurna Devi",
	        "Shri Kiren Rijiju","Shri Hardeep Singh Puri",
	        "Shri Mansukh L. Mandaviya","Shri G. Kishan Reddy",
               };

			Country.cabinetMinisters(cabinetMinisters);

}
}