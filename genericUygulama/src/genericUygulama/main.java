package genericUygulama;

public class main {
	public static void main(String[] args) {
		personManager<teacher> teachers = new personManager<>();
		personManager<student> students = new personManager<>();
		
		student s1 = new student("Samet", "�avur", 23,"12345");
		student s2 = new student("Hakk�", "Sini", 32,"62614");
		student s3 = new student("Resul","�a�maz",28,"13221");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		teacher t1 = new teacher("Murat", "Y�ld�ray", 43, "Matematik");
		teacher t2 = new teacher("Engin", "Y�ld�rmaz", 27, "Fizik");
		teacher t3 = new teacher("Tayfun", "Y�ksek", 33, "Yaz�l�m");
		teachers.add(t1);
		teachers.add(t2);
		teachers.add(t3);
		
		System.out.println("---Students---");
		students.show();
		System.out.println("---Teachers---");
		teachers.show();
		
		System.out.println(t2);
		
		
		
	}
}
