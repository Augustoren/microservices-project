package br.com.augustorenan.models;

public class GreetingModel {
	
	private long counter;
	private String name;
	
	public GreetingModel(long counter, String name) {
		super();
		this.counter = counter;
		this.name = name;
	}

	public long getCounter() {
		return counter;
	}

	public void setCounter(long counter) {
		this.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
