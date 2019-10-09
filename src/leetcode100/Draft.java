package leetcode100;
import java.util.*;

public class Draft{
	public static void main(String[] args) {
		List<Fruit> list=new ArrayList<Fruit>();
		Fruit apple=new Fruit();
		apple.setId(0);
		apple.setName("apple");
		Fruit banana=new Fruit();
		banana.setId(3);
		banana.setName("banana");
		list.add(apple);
		list.add(banana);
		
		Collections.sort(list,(a,b)->(a.getId()-b.getId()));
		
		System.out.println(list);
	}
}

class Fruit{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id: "+String.valueOf(id)+"\nname: "+name+"\n";
	}
}