package esnekBaglanti;

public class araba {
	private String marka;
	private String model;
	private int yil;
	
	public araba() {}
	public araba(String marka,String model,int yil) {
		this.marka=marka;
		this.model=model;
		this.yil=yil;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	@Override
	public String toString() {
		return "araba [marka=" + marka + ", model=" + model + ", yil=" + yil + "]";
	}
}
