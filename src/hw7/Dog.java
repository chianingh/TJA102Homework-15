package hw7;

import java.io.Serializable;

import hw7.Hw7_45.Animal;

public class Dog implements Serializable, Animal {
	private String name;
	private static final long serialVersionUID = 1L;

	public Dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
