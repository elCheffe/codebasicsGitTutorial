package mainPackage;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, world!");
		
		System.out.println("Are you hungry? (yes, no)");
		
		String hungry = "";
		
		Scanner scanner = new Scanner(System.in);
		hungry = scanner.nextLine();
		
		if (hungry.toLowerCase().equals("yes")) {
			System.out.println("eat samosa! :)");
		} else {
			System.out.println("do your homework.");
		}
		
	}

}
