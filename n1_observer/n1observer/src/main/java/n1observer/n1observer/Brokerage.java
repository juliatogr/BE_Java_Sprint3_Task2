package n1observer.n1observer;

public class Brokerage {
	
	private String name;
	
	private Broker b = null;
	
	Brokerage(String name, Broker b){
		this.name = name;
		this.b = b;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void update() {
		System.out.println("Hi " + this.name + ". " + this.b.getLastChange());
	}
}
