package bof_java_fundamentals;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Library {
	private static int id = 0;
	private String name;
	private TreeMap<Integer, LibraryBook> books;
	private ArrayList<LibraryPerson> persons;
	private ArrayList<LibraryBooksBorrowed> borrows;

	public Library(String name) {
		this.name = name;
		this.books = new TreeMap<Integer, LibraryBook>();
		this.persons = new ArrayList<LibraryPerson>();
		this.borrows = new ArrayList<LibraryBooksBorrowed>();
	}

	public String getName() {
		return this.name;
	}

	public void addPerson(LibraryPerson person) {
		this.persons.add(person);
	}

	public void showPersons() {
		System.out.println(this.persons);
	}

	private boolean access(String personName) {
		boolean access = false;

		for (LibraryPerson person : this.persons) {
			if (person instanceof Admin && person.getName() == personName)
				access = true;
		}

		return access;
	}

	public void addBook(String personName, LibraryBook book) {
		if (this.access(personName)) {
			Integer id = Library.id++;
			this.books.put(id, book);
		}
	}

	public void removeBook(String personName, int id) {
		if (this.access(personName)) {
			this.books.remove(id);
		}
	}

	public Book getBook(int id) {
		LibraryBook book = this.books.get(id);
		if (book == null)
			return null;
		return book.getCopies() > 0 ? book.getBook() : null;
	}

	public LibraryBook getLibraryBook(int id) {
		LibraryBook book = this.books.get(id);
		return book != null ? book : null;
	}

	public void updateBook(String personName, int id, LibraryBook book) {
		if (this.access(personName)) {
			if (this.books.get(id) == null)
				return;
			this.books.put(id, book);
		}
	}

	public void showBooks() {
		System.out.println(this.books.values());
	}

	public LibraryPerson getPersonByName(String name) {
		for (LibraryPerson person : persons)
			if (person.getName() == name)
				return person;
		return null;
	}

	public boolean borrowBook(String staff, String user, LibraryBook book) {
		boolean isBorrow = false;

		if (this.access(staff)) {
			LibraryPerson LibraryUser = getPersonByName(user);
			if (LibraryUser != null) {
				Date date = new Date(System.currentTimeMillis());
				LibraryBooksBorrowed borrow = new LibraryBooksBorrowed(book, LibraryUser, date);
				borrows.add(borrow);
				isBorrow = true;
			}
		}

		return isBorrow;
	}

	public void showBorrows() {
		for (LibraryBooksBorrowed borrow : borrows)
			System.out.println(borrow);
	}

}
