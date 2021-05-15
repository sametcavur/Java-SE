package Deneme;

public class adres {
	private String sokak;
	private String cadde;
	private String mahalle;
	private String ilce;
	private String il;
	public adres(String sokak, String cadde, String mahalle, String ilce, String il) {
		super();
		this.sokak = sokak;
		this.cadde = cadde;
		this.mahalle = mahalle;
		this.ilce = ilce;
		this.il = il;
	}
	public adres() {
		
	}
	public String getSokak() {
		return sokak;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getMahalle() {
		return mahalle;
	}
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	@Override
	public String toString() {
		return "adres [sokak=" + sokak + ", cadde=" + cadde + ", mahalle=" + mahalle + ", ilce=" + ilce + ", il=" + il+ "]";
	}
	
	
}
