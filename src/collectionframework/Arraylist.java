package collectionframework;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String args[]) {
		ArrayList<String>todos = new ArrayList<String>();
		todos.add("Play Games");
		todos.add("Practice Java");
		todos.add("Go to Work");
		for(String todo:todos) {
			System.out.println(todo);
			
		}
	
		System.out.println(todos.size());
		
		
	}
	

	

}
