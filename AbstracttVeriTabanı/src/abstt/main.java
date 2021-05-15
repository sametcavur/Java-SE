package abstt;
public class main {
	public static void main(String[] args) {
		customerManager cM = new customerManager();
		cM.baseManager = new oracleManager();
		cM.getCustomersInfo();
		
	}
	

}
