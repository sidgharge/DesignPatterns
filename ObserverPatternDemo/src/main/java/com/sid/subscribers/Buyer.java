package com.sid.subscribers;

public class Buyer implements Subscriber {

	private boolean isSubscribed;

	@Override
	public void update() {
		System.out.println("Subscriber called");
	}

	

}
