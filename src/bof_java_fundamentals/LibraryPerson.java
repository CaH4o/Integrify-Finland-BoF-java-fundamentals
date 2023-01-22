package bof_java_fundamentals;

public class LibraryPerson extends Person {
	private ERole role;

	public LibraryPerson(String name, ERole role) {
		super(name);
	}

	public ERole getRole() {
		return role;
	}

	public void setRole(ERole role) {
		this.role = role;
	}

}
