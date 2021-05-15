package denem;

public class Test {
	public static void main(String[] args) {
		Karee kare = new Karee();
		Daire daire = new Daire();
		Karee kare1 = new Karee(5);
		Daire daire1 = new Daire(6);
		kare.setKenar(3);
		daire.setR(6);
		getAlanVeCevre(daire);
		System.out.println("---");
		getAlanVeCevre(daire1);
		System.out.println("---");
		getAlanVeCevre(kare);
		System.out.println("---");
		getAlanVeCevre(kare1);
	
		
	}
	public static void getAlanVeCevre(deneme sekil) {
		if(sekil instanceof Karee) {
			System.out.println("Karenin Þekli="+sekil.alanHesapla());
			System.out.println("Karenin Alaný="+sekil.cevreHesapla());}
		if(sekil instanceof Daire) {
			System.out.println("Dairenin Þekli="+sekil.alanHesapla());
			System.out.println("Dairenin Alaný="+sekil.cevreHesapla());}

	}

}
