package fileislemlerifile;

import java.io.*;
import java.util.Date;

public class file {
	public static void main(String[] args) {
		File dosya = new File("C:/Users/Hp/Desktop/Dersler");
		System.out.println(dosya.canExecute()); //Dosya Çalýþýyor mu
		System.out.println(dosya.canRead());  //Dosya okunabilir mi
		System.out.println(dosya.canWrite());  //Dosya Yazýlabilir mi
		System.out.println(dosya.getAbsolutePath());  //Dosyanýn tam yeri
		System.out.println(dosya.getName());  //Dosyanýn Adý
		System.out.println(dosya.getParent());  //Dosya nereye baðlý
		System.out.println(dosya.lastModified());  //Dosya en son ne zaman düzenlendi
		Date date = new Date(dosya.lastModified());  
		System.out.println(date);  //Dosya en sonra ne zaman düzenlendi.(Tam Tarih)
	}

}
