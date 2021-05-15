package genericUygulama;

public class teacher extends person{
	private String branch;
	
	public teacher() {}

	public teacher(String name, String surname, int age, String branch) {
		super(name, surname, age);
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "teacher [branch=" + branch + ", Name=" + getName() + ", Surname=" + getSurname()
				+ ", Age=" + getAge() + "]";
	}
	
	

}
