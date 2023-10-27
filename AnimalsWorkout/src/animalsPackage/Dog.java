package animalsPackage;

public class Dog extends AbstractAnimal implements AnimalInterface {

	
	  int age = 15;
	
	    
	    public Dog (int age, int legs, String soundDog){
	        this.age = age;
	        this.legs = legs;
	       System.out.println("The age of the Dog is: " + age + " "+ " and it has " + legs + " legs");
	        
	    }

//		@Override
//		public void animalWalk() {
//			System.out.println("The Dog walks");
//			
//		}
		
		@Override
		public void bark(String soundDog) {
			System.out.println("The Dog barks: " + soundDog);
		}
	    
	    
	    
	    
	    
		
}
