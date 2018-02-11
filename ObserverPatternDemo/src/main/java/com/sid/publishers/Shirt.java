package com.sid.publishers;

import java.util.HashSet;
import java.util.Set;

import com.sid.subscribers.Subscriber;

public class Shirt implements Publisher {

	private Set<Subscriber> subscribers = new HashSet<>();

	private boolean isAvailable;

	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void publish() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update();
		}
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
