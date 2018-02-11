package com.sid.publishers;

import com.sid.subscribers.Subscriber;

public interface Publisher {

	void subscribe(Subscriber subscriber);
	
	void unsubscribe(Subscriber subscriber);
	
	void publish();
}
