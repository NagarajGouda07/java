class State 
{
    String name;
    String language;
    CapitalCity capitalCity;

    State(String name, String language, CapitalCity capitalCity)
	{
        this.name = name;
        this.language = language;
        this.capitalCity = capitalCity;
    }

    void printDetails() 
	{
        System.out.println("State Name: " + name + ", Language: " + language);
        capitalCity.printDetails();
    }
}