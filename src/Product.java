import java.util.Scanner;

public class Product {
    private String name;
    private int price;
    private boolean sale;

    public Product(String name, int price, boolean sale) {
        this.name = name;
        this.price = price;
        this.sale = sale;
    }

    public void getName() {
        System.out.println("Name is " + name);
    }

    public void getPrice() {
        System.out.println("Price is " + price);
    }

    public void getSale() {
        System.out.println("Is on sale?: " + sale);
    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name + " was added.");
    }
    public void delete(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name + " was deleted.");
    }
    public void showInfo() {
        System.out.println("Name: " + name + ", Price: " + price + " tg, Sale: " + sale);
    }
}