package mainPackage;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
		Thread.sleep(1000);
		System.out.println("nice. you're done.");
		
	}

}
