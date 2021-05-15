package genericUygulama;

public class student extends person {
	private String scNumber;
	
	public student() {}

	public student(String name, String surname, int age, String scNumber) {
		super(name, surname, age);
		this.scNumber = scNumber;
	}

	public String getScNumber() {
		return scNumber;
	}

	public void setScNumber(String scNumber) {
		this.scNumber = scNumber;
	}

	@Override
	public String toString() {
		return "student [scNumber=" + scNumber + ", Name=" + getName() + ", Surname=" + getSurname()
				+ ", Age=" + getAge() + "]";
	}
	
	
	
	

}
