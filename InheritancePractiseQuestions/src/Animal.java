public class Animal {
    protected String name;
    public int age;
    public String color;

    public Animal(){
        this.name = "Rinky";
        this.age = 05;
        this.color = "Golden";
    }

    public Animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println("The Animal eats");
    }
    public void sleep(){
        System.out.println("The Animal sleeps");
    }
}
