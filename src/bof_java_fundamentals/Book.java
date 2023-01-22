package bof_java_fundamentals;

public class Book {
	private String isbn;
	private String title;
	private Author author;
	private String edition;
	private int pages;

	public Book(String isbn, String title, Author author, String edition, int pages) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return String.format("ISBN: %s; Title: %s; author: %s;", isbn, title, author.getName());
	}
}
