package bof_java_fundamentals;

import java.util.ArrayList;

public class LibraryBook {
	private Book book;
	private int copies;
	private ArrayList<ECategory> category;

	public LibraryBook(Book book, int copies) {
		this.book = book;
		this.setCopies(copies);
	}

	public ArrayList<ECategory> getCategory() {
		return category;
	}

	public void setCategory(ArrayList<ECategory> category) {
		this.category = category;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public Book getBook() {
		return book;
	}

	@Override
	public String toString() {
		return String.format("%s (%d cpoies)", book, copies);
	}

}
