import java.awt.font.LayoutPath;

enum Laptop{
    Mackbook(2000), Surface, Thinkpad(1800), XPS(1500);

    private int price;

    private Laptop(){
        price = 500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

public class EnumDemo1 {
    public static void main(String[] args) {
        Laptop[] laptopArray = Laptop.values();

        for(Laptop lap : laptopArray){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
