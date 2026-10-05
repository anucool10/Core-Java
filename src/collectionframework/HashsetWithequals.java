package collectionframework;

import java.util.HashSet;
import java.util.Objects;

public class HashsetWithequals {
static class Book{
	String title;
	public Book(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
	public static void main(String[] args) {
		HashSet<Book>name = new HashSet<>();
		Book book1 = new Book("Atomic habits");
		Book book2 = new Book("Atomic habits");
		Book book3 = new Book("Atomic habits");
		
		name.add(book1);
		name.add(book2);
		
		System.out.println("Number of books: " + name.size());
		System.out.println(name.contains(book2));
		System.out.println(name.contains(book3));
		
	}
	
}

}
