package bof_java_fundamentals;

import java.util.ArrayList;

public class Author extends Person {
	private ArrayList<ECategory> category;

	public Author(String name) {
		super(name);
	}

	public ArrayList<ECategory> getCategory() {
		return category;
	}

	public void setCategory(ArrayList<ECategory> category) {
		this.category = category;
	}

}
