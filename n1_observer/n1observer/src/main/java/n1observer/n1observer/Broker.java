package n1observer.n1observer;

import java.util.ArrayList;

public class Broker {
	private ArrayList<Brokerage> brokerages;
	String lastChange = "";
	
	Broker(){
		this.brokerages = new ArrayList<Brokerage>();
	}
	
	public void attachBrokerage(Brokerage b){
		this.brokerages.add(b);
	}
	
	public void detachBrokerage(Brokerage b){
		this.brokerages.remove(b);
	}
	
	public void increaseStock() {
		lastChange = "Stock increased.";
		notifyBrokerages();
	}
	
	public void decreaseStock() {
		lastChange = "Stock decreased.";
		notifyBrokerages();
	}
	
	public String getLastChange() {
		return lastChange;
	}
	
	public void notifyBrokerages() {
		for (Brokerage b : brokerages) {
			b.update();
		}
	}
}
