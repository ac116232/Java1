package youDoIt;
import java.util.Scanner;
public class CreateSpaService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String service;
		double price;
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		firstService = getData(secondService);
		secondService = getData(secondService);
		
		System.out.println("First Service detais");
		System.out.println(firstService.setServiceDescription() + " $ " + firstService.getPrice());
		System.out.println("Second Service details");
		System.out.println(secondService.setServiceDescription() + "$" + secondService.getPrice());
		
		Scanner keyboard = new Scanner(System.in);
		
	}
	public static SpaService getData(SpaService s) {
		
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		

		System.out.println("Enter Service >>>");
		service = keyboard.nextLine();
		System.out.println("Enter Price >>> ");
		price = keyboard.nextDouble();
		s.secondService.setServiceDescription(service);
		s.secondService.setPrice(price);
	}

}
