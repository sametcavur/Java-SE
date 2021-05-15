package Logger;

public class main {
	public static void main(String[] args) {
		
		  baseLogger islem1 = new databaseLogger();
		  customerManager cM = new customerManager(); 
		  cM.Add(islem1);
		  baseLogger islem2 = new fileLogger();
		  customerManager cM2 = new customerManager(); 
		  cM.Add(islem2);
	}
}
