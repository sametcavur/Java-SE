package genericUygulama;

public class main {
	public static void main(String[] args) {
		personManager<teacher> teachers = new personManager<>();
		personManager<student> students = new personManager<>();
		
		student s1 = new student("Samet", "Çavur", 23,"12345");
		student s2 = new student("Hakkı", "Sini", 32,"62614");
		student s3 = new student("Resul","Şaşmaz",28,"13221");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		teacher t1 = new teacher("Murat", "Yıldıray", 43, "Matematik");
		teacher t2 = new teacher("Engin", "Yıldırmaz", 27, "Fizik");
		teacher t3 = new teacher("Tayfun", "Yüksek", 33, "Yazılım");
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
