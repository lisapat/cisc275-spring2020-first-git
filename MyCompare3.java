import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3 {
	
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		
		// sorts ascending order
		Collections.sort(dogs, new Comparator<Animal>() { // anonymous class object implements Comparator<Animal>
		
		@Override
		public int compare(Animal a, Animal b){
		return a.getLegs() - b.getLegs();
		
		// equals() is already overridden as Object class is superclass
		}
		
		});
		
		/* Here's another way to make sense above:
		Comparator<Animal> c = new myComparator(); // interface<T> name = new class() (myComparator implements Comparator)
		
		Collections.sort(dogs, new myComparator() or c); // takes list & Comparator<T> => sort
		*/

		System.out.println(dogs);
	}
}