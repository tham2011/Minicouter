package KeThua;

public class sinhvien {
	protected int msv;
	protected String ten;
	protected float phi;
	protected float thue;

	public sinhvien(int msv, String ten, float phi, float thue) {
		super();
		this.msv = msv;
		this.ten = ten;
		this.phi = phi;
		this.thue = thue;

	}

	public int getMsv() {
		return msv;
	}

	public void setMsv(int msv) {
		this.msv = msv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getPhi() {
		return phi;
	}

	public void setPhi(float phi) {
		this.phi = phi;
	}

	public float getThue() {
		return thue;
	}

	public void setThue(float thue) {
		this.thue = thue;
	}

	@Override
	public String toString() {
		return "msv=" + msv + ", ten=" + ten + ", phi=" + phi + ", thue=" + thue;
	}

}
