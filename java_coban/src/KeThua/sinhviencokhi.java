package KeThua;

public class sinhviencokhi extends sinhvien {
	private String kynang;

	public sinhviencokhi(int msv, String ten, float phi, float thue, String kinang) {
		super(msv, ten, phi, thue);
		this.kynang = kinang;

	}

	public String getKynang() {
		return kynang;
	}

	public void setKynang(String kynang) {
		this.kynang = kynang;
	}

	public void tinhthue() {
		float TinhTien = phi * thue;
	}

	@Override
	public String toString() {
		return "sinhviencokhi [kynang=" + kynang + "]";
	}

}
