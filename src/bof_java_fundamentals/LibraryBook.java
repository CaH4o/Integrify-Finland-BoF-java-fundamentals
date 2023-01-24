package bof_java_fundamentals;

import java.util.ArrayList;

public class LibraryBook {
	private Book book;
	private int copies;
	private ArrayList<ECategory> category;

	public LibraryBook(Book book, int copies) {
		this.book = book;
		this.setCopies(copies);
		this.category = new ArrayList<ECategory>();
	}

	public ArrayList<ECategory> getCategory() {
		return category;
	}

	public void setCategory(ECategory category) {
		this.category.add(category);
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
		return String.format("%s (%d cpoies) Cat: %s", this.book, this.copies, this.category);
	}

}
