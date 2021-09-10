import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Create arraylist of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1); //adding Fruit class object
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2); //adding Fruit class object
		Fruit s3 = new Fruit(103, "Kiwi", 2000);
		fl.add(s3); //adding Fruit class object
		
		Collections.sort(fl, new FruitComparator());
		//Traverse elements of arraylist (ordered)
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		//traverse elements of arraylist (reverse ordered)
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
	}
}
