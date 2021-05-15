package esnekBaglanti;

import java.util.ArrayList;

public interface I_arabaIslemleri {
	public ArrayList<araba> arabalar = new ArrayList<>();
	public boolean arabaKaydet(araba araba);
	public boolean arabaSil(araba araba);
	public void arabaBilgiGoster(araba araba);
	public void listele();
}
