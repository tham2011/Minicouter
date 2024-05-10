package KeThua;

public class sinhvienit extends sinhvien {
	private String ngonngu;

	public sinhvienit(int msv, String ten, float phi, float thue, String ngonngu) {
		super(msv, ten, phi, thue);
		this.ngonngu = ngonngu;
	}

	public String getNgonngu() {
		return ngonngu;
	}

	public void setNgonngu(String ngonngu) {
		this.ngonngu = ngonngu;
	}

	public float tinhthue() {
		return phi * thue;
	}

	@Override
	public String toString() {
		return super.toString() + " ngonngu=" + ngonngu;
	}

}
