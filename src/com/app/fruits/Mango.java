package com.app.fruits;

class Mango extends Fruits {

	public Mango() {
		super();
		
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		
	}

	@Override
	public String taste() {
		return "sweet";
	}

	

	
}
