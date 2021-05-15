package tarih;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JLabel;

public class calender {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021,1,27);
		System.out.println(cal.getTime());
		//Simple Formatla Yazma//
		SimpleDateFormat simpCal = new  SimpleDateFormat("dd.MM.yyyy");
		System.out.println(simpCal.format(cal.getTime()));
		//gün ay yýlý ayrý ayrý ekleme//
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.YEAR, 2016);
		cal1.set(Calendar.MONTH,6);
		cal1.set(Calendar.DAY_OF_YEAR, 26);
		System.out.println(cal1.getTime());
		
	}

}
