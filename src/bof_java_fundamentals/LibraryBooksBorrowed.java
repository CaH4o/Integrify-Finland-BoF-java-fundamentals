package bof_java_fundamentals;

import java.util.Date;

public class LibraryBooksBorrowed {
	private LibraryBook book;
	private LibraryPerson person;
	private Date borrowDay;
	private boolean isReterned;

	public LibraryBooksBorrowed(LibraryBook book, LibraryPerson person, Date borrowDay) {
		this.book = book;
		this.person = person;
		this.borrowDay = borrowDay;
		this.isReterned = false;
	}

	public boolean isReterned() {
		return isReterned;
	}

	public void setReterned(boolean isReterned) {
		this.isReterned = isReterned;
	}

	@Override
	public String toString() {
		return String.format("Borrow:\n Book: %s\n Who: %s;\n When: %s;\n Return: %b.", this.book.getBook(),
				this.person, this.borrowDay.toString(), this.isReterned);
	}
}
