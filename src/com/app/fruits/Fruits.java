package com.app.fruits;

public abstract class Fruits {
	
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruits() {
		
	}
	public Fruits(String color, double weight, String name, boolean isFresh) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public abstract String taste();
	
	
//	public String toString(String color, double weight, String name, boolean isFresh ) {
//		return "color:- "+color+" weight:- "+weight+" name:- "+name+" isFresh:- "+isFresh;
//	}
	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	

	

}
