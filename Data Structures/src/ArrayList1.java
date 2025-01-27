import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        //adding elements to the list
        listOfNumbers.add(10);
        listOfNumbers.add(20);

        //displaying the list
        System.out.println(listOfNumbers);

        //adding a new element to the existing list
        listOfNumbers.add(30);

        //displaying the updated list
        System.out.println(listOfNumbers);

        //removing the element from the list at the given index
        listOfNumbers.remove(0);

        //displaying the updated link
        System.out.println(listOfNumbers);


        //creating a String list
        ArrayList<String> fruits = new ArrayList<String>();

        //adding elements to the newly created 'fruits' list
        fruits.add("Apple");
        fruits.add("Chiku");
        fruits.add("Guava");
        fruits.add("Kiwi");

        //displaying the fruits list
        System.out.println(fruits);

        //setting the value kiwi to jackfruit
        fruits.set(3, "jackfruit");

        //displaying the updated fruits list
        System.out.println(fruits);
    }
}