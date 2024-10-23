package com.app.fruits;

class Orange extends Fruits {

	
	
	public Orange() {
		super();
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	@Override
	public String taste() {
		return "sour";
	}

	
	
	

}
