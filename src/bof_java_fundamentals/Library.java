package bof_java_fundamentals;

import java.util.ArrayList;
import java.util.TreeMap;

public class Library {
	private static int id = 0;
	private String name;
	private TreeMap<Integer, LibraryBook> books;
	private ArrayList<LibraryPerson> persons;
	private ArrayList<LibraryBooksBorrowed> borrows;

	public Library(String name) {
		this.name = name;
		books = new TreeMap<Integer, LibraryBook>();
		persons = new ArrayList<LibraryPerson>();
		borrows = new ArrayList<LibraryBooksBorrowed>();
	}

	public ArrayList<LibraryPerson> getPersons() {
		return persons;
	}

	public void addPerson(LibraryPerson person) {
		this.persons.add(person);
	}

	private boolean access(String personName) {
		boolean access = false;

		for (LibraryPerson person : persons) {
			if (person instanceof Admin && person.getName() == personName)
				access = true;
		}

		return access;
	}

	public void addBook(String personName, LibraryBook book) {
		if (this.access(personName)) {
			Integer id = Library.id++;
			books.put(id, book);
		}
	}

	public void getBooks() {
		System.out.println(books.values());
	}

}
