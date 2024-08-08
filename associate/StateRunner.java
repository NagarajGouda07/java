public class StateRunner {
    public static void main(String[] args) {
         CapitalCity capitalCity = new CapitalCity("New Delhi", 250000);
        State state = new State("Delhi", "Hindi", capitalCity);
        Country country = new Country("India", "Asia", state);
        country.printDetails();
	}
}