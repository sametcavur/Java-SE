package tarih;

import java.text.SimpleDateFormat;
import java.util.*;

public class date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//Sadece g�n ay y�l olarak yazd�rma//
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println(dateFormat.format(date));
	}

}
