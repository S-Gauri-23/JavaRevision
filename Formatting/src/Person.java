public class Person {
    private String name, city, state;

    Person(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}
