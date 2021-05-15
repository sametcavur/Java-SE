package genericUygulama;

import java.util.ArrayList;

public class personManager<belliOlmayanDegisken extends person> {
	private ArrayList<belliOlmayanDegisken> p = new ArrayList<>();
	public void add(belliOlmayanDegisken person) {
		p.add(person);
	}
	public void remove(belliOlmayanDegisken person) {
		p.remove(person);
	}
	public void show() {
		for (belliOlmayanDegisken person : p) {
			System.out.println(person);
		}
	}
}
