package observerpattern;

public class ClientClass implements AnimalAddedListener{

	@Override
	public void onAnimalAdded(Animal animal) {
		System.out.println("Animal Added: " +animal.getName());
		
	}

	@Override
	public Object updateAnimalAdded(Animal animal) {
		System.out.println("Animal updated: " +animal.getName());
		return animal;
	}

}
