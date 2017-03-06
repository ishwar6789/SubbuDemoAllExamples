package designpatterns.javadesignpatterns;

import observerpattern.Animal;
import observerpattern.ClientClass;
import observerpattern.CrickerMatch;
import observerpattern.TVNine;
import observerpattern.Zoo;

public class MainClass {

	public static void main(String[] args) {
		// Observer pattern
		System.out.println("Observer Pattern ...  ");
		Zoo zoo = new Zoo();
        // Register a listener to be notified when an animal is added
        zoo.registerAnimalAddedListener(new ClientClass());
        // Add an animal notify the registered listeners
        zoo.addAnimal(new Animal("Tiger"));
        
        //observerPattern with java interfaces
        
        CrickerMatch cm = new CrickerMatch();        
        cm.addObserver(new TVNine());
        cm.setScore("India 100");
        
        
        

	}

}
