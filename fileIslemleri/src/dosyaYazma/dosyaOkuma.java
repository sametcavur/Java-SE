package dosyaYazma;

import java.io.*;
import java.util.Scanner;

public class dosyaOkuma {
	Scanner scan;
	
	public void dosyaOkumayiAc(String dosyaIsmi) {
		File file = new File("C:/Users/Hp/Desktop/"+dosyaIsmi+".txt");
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
	}}
	public void dosyaOkumayiKapat(String dosyaIsmi) {
		scan.close();
	}
	public void dosyaOkuma(){
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}
	

}
