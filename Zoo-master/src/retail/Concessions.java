package retail;

import java.util.Scanner;

public class Concessions {

    public static void displayConcessions(){

        Scanner input = new Scanner(System.in);
        int userChoice;

        m("Welcome to the concession stand where we hose you on our prices");
        m("What would you like to order");
        m("1) Pop = $3");
        m("2) Hot Dog = $4");
        m("3) Popcorn = $1");
        m("4) Candy $1");
        m("5) Walking Taco $5");
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
