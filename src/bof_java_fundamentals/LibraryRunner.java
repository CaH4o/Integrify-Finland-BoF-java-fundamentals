package bof_java_fundamentals;

public class LibraryRunner {

	public static void main(String[] args) {
		// create an library
		Library centralLibrary = new Library("Central");

		// create an admin
		Admin admin = new Admin("adminName");
		centralLibrary.addPerson(admin);

		// create books
		Book book1 = new Book("12345678", "Title1", new Author("Author1"), "edition limited", 200);
		Book book2 = new Book("87654321", "Title2", new Author("Author1"), "edition limited", 100);
		Book book3 = new Book("12312312", "Title3", new Author("Author2"), "edition fake", 150);
		LibraryBook book1Lb = new LibraryBook(book1, 3);
		LibraryBook book2Lb = new LibraryBook(book2, 1);
		LibraryBook book3Lb = new LibraryBook(book3, 20);
		centralLibrary.addBook("adminName", book1Lb);
		centralLibrary.addBook("adminName", book2Lb);
		centralLibrary.addBook("adminName", book3Lb);
		centralLibrary.showBooks();

		// create users
		User user1 = new User("User1");
		User user2 = new User("User2");
		centralLibrary.addPerson(user1);
		centralLibrary.addPerson(user2);
		centralLibrary.showPersons();

		// update a book
		System.out.println(centralLibrary.getLibraryBook(1));
		LibraryBook bookToChane = centralLibrary.getLibraryBook(1);
		bookToChane.setCategory(ECategory.HISTORICAL);
		bookToChane.setCategory(ECategory.SCIENTIFIC);
		bookToChane.setCopies(bookToChane.getCopies() + 1);
		centralLibrary.updateBook("adminName", 1, bookToChane);
		System.out.println(centralLibrary.getLibraryBook(1));

		// user borrow book
		LibraryBook bookToborrow = centralLibrary.getLibraryBook(1);
		centralLibrary.borrowBook("adminName", "User1", bookToborrow);
		centralLibrary.showBorrows();
	}

}
