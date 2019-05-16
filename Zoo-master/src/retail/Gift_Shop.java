package retail;

import java.util.Scanner;

public class Gift_Shop {

    public static void displayGift_Shop(){

        Scanner input = new Scanner(System.in);
        int userChoice;

        m("Welcome to the Gift Shop stand where we hose you on our prices");
        m("What would you like to buy");
        m("1) Stuffed Animal = $10");
        m("2) Magnets = $4");
        m("3) Stuffed Snake = $10");
        m("4) Toys = $7");
        m("5) Shirts = $15");
        m("6) Sweatshirts = $20");
        m("7) Umbrellas = $5");
        m("8) Blankets = $20");
        m("9) Keychains $2");
        m("10) Necklace $5");
        userChoice = input.nextInt();

        switch (userChoice){
            case 1:
                //subtract from wallet here
                break;
            case 2:
                //subtract from wallet here
                break;
            default:
                m("Option does not exist");
        }
    }
    public static void m(String r){
        System.out.println(r);
    }

}
