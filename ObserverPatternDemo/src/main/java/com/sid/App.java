package com.sid;

import java.util.Scanner;

import com.sid.publishers.Publisher;
import com.sid.publishers.Shirt;
import com.sid.subscribers.Buyer;
import com.sid.subscribers.Subscriber;

public class App {
	
	public static void main(String[] args) {
		Subscriber subscriber = new Buyer();
		Subscriber subscriber2 = new Buyer();
		Publisher publisher = new Shirt();
		publisher.subscribe(subscriber);
		
		Scanner scanner = new Scanner(System.in);
		
		boolean quit = false;
		do {
			System.out.println("Is shirt available? Y/N");
			String input = scanner.nextLine();
			switch (input) {
			case "Y":
				publisher.publish();
				break;

			case "N":
				break;
				
			default:
				scanner.close();
				quit = true;
				System.out.println("Quiting...");
				break;
			}
		} while (!quit);
	}
}
