package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public Application() {
		System.out.println("Inside Application");
	}

	public void greet() {
		List<String> lista= new ArrayList();
		lista.add("Hello");
		
		for(String el: lista)
			System.out.println(el);
	}
	
	// method main(): ALWAYS the APPLICATION entry point
	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application app = new Application();
		app.greet();
	}
}