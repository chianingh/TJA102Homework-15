package hw7;

import java.io.Serializable;

import hw7.Hw7_45.Animal;

public class Cat implements Serializable, Animal {
	private String name;
	private static final long serialVersionUID = 1L;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
