class InformationRunner{
public static void main(String[] args){
	String[] states = {  "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", 
            "Chhattisgarh", "Goa", "Gujarat", "Haryana", 
            "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", 
            "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", 
            "Mizoram", "Nagaland", "Odisha", "Punjab", 
            "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", 
            "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"};
			
			Information.states(states);
			
			int[] pincode ={577205,577205,577206,577207,577208,577209,577321,577435,577986,577123};
	Information.pincode(pincode);
	
	String[] primeminister = {  "Jawaharlal Nehru",
            "Gulzarilal Nanda",
            "Lal Bahadur Shastri",
            "Indira Gandhi",
            "Morarji Desai",
            "Charan Singh",
            "Rajiv Gandhi",
            "Vishwanath Pratap Singh",
            "Chandra Shekhar",
            "P. V. Narasimha Rao",
            "Atal Bihari Vajpayee",
            "H. D. Deve Gowda",
            "Inder Kumar Gujral",
            "Manmohan Singh",
            "Narendra Modi"};
			Information.primeminister(primeminister);
			
			String[] politicalparty = {"Indian National Congress",
            "Bharatiya Janata Party",
            "Communist Party of India",
            "Aam Aadmi Party",
            "Bahujan Samaj Party"};
			
			Information.politicalparty(politicalparty);
	
}
}