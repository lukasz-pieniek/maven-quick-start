package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

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
	
	public int countWords(String sentence) {
		 String[] words = StringUtils.split(sentence,' ' );
		return (words == null) ? 0 : words.length;
	}
	
	// method main(): ALWAYS the APPLICATION entry point
	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application app = new Application();
		app.greet();
		System.out.println("Word Count: " + app.countWords("as ma kot i cztery litery"));
	}
}