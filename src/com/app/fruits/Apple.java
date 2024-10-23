package com.app.fruits;

class Apple extends Fruits {

	
	public Apple() {
		super();
		
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}

	
	
}
