package com.katas;

public class Greeter {

	private String name;

	public Greeter(String name) {
		this.name = name;
	}

    public String sayHello() {
        return "Hello, " + name + "!";
    }

}
