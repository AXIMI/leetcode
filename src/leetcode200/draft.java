package leetcode200;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class draft {
	public static void main(String[] args) {
		LinkedHashSet<Fruit> set=new LinkedHashSet<>();
		Fruit apple=new Fruit(10);
		Fruit banana=new Fruit(4);
		Fruit pear=new Fruit(8);
		Fruit strawberry=new Fruit(39);
		Fruit blueberry=new Fruit(36);

		set.add(apple);
		set.add(banana);
		set.add(pear);
		set.add(strawberry);
		set.add(blueberry);
		
		Iterator<Fruit> fruits=set.iterator();
		while(fruits.hasNext())
			System.out.print(fruits.next());
	}
}

class Fruit{
	int price;
	
	public Fruit(int price) {
		this.price=price;
	}
	
	public String toString() {
		return price+" ";
	}
}
