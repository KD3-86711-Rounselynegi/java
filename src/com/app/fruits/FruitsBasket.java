package com.app.fruits;

import java.util.Scanner;

public class FruitsBasket {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display fruits name");
		System.out.println("5. Display fresh fruits details");
		System.out.println("6. Display tastes of all stale fruits");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the basket");
		size = sc.nextInt();
		Fruits[]array = new Fruits[size];
		int index = 0;
		
		while((choice = menu(sc))!=0) {
			switch(choice) {
			
			case 1:
				if(index < size) {
					array[index] = new Mango("Yellow", 5, "mango", true);
					index++;
				}
				break;
				
			case 2:
				if(index < size) {
					array[index] = new Orange("Tangy",4,"Orange", true);
					index++;
				}
				break;
			
			case 3:
				if(index < size) {
					array[index] = new Apple("Red",3,"Apple", true);
					index++;
				}
				break;
			
			case 4:
				 for (Fruits fruit : array) {
                     if (fruit != null) {
                         System.out.println(fruit.getName());
                     }
                 }
                 break;
				
			case 5:
				 for (Fruits fruit : array) {
                     if (fruit != null && fruit.isFresh()) {
                         System.out.println(fruit + ", Taste: " + fruit.taste());
                     }
                 }
                 break;
			case 6:
				for (Fruits fruit : array) {
                    if (fruit != null && !fruit.isFresh()) {
                        System.out.println("Stale fruit taste: " + fruit.taste());
                    }
                }
				break;
			case 7:
				System.out.println("Enter index to mark as stale: ");
                int in = sc.nextInt();
                if (in >= 0 && in < index && array[in] != null) {
                    array[in].setFresh(false);
                    System.out.println(array[in].getName() + " marked as stale.");
                } else {
                    System.out.println("Invalid index.");
                }
                break;
				
			case 8:
				for (Fruits fruit : array) {
                    if (fruit != null && "sour".equals(fruit.taste())) {
                        fruit.setFresh(false);
                        System.out.println(fruit.getName() + " marked as stale.");
                    }
                }
				
				break;
				
			}
		}

	}

}
