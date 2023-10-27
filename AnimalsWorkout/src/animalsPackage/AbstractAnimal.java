package animalsPackage;

public class AbstractAnimal {
	
	public int legs;
	public String soundDog = "Guau guau";
	public String soundCat = "Miau";
	

	public void bark(String soundDog) {
		
	
	}
	
	@Override
	public String toString() {
		return this.soundDog;
	}
    

}
