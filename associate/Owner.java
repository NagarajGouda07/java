class Owner 
{
    String name;
    int age;
    String gender;

    Owner(String name, int age, String gender) 
	{
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void printDetails() 
	{
        System.out.println("Owner Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}