package ders3;

public class adres {
	// Assocation (Nesneler Arasý Ýliþki) Classý //
	private String il;
	private String ilce;
	private String sokak;
	public adres(String il, String ilce, String sokak) {
		this.il = il;
		this.ilce = ilce;
		this.sokak = sokak;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	public String getSokak() {
		return sokak;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}
	@Override
	public String toString() {
		return "adres [il=" + il + ", ilce=" + ilce + ", sokak=" + sokak + "]";
	}
	
	
}
