package BT_Java;

public class xeploai {
	private Integer SoTT;
	private Integer MaSV;
	private Integer KyHoc;
	private String MonHoc;
	private double DiemMonHoc1;
	private double DiemMonHoc2;
	private double DiemMonHoc3;

	public xeploai(Integer SoTT, Integer maSV, Integer kyHoc, String monHoc, double diemMonHoc1, double diemMonHoc2,
			double diemMonHoc3) {
		this.SoTT = SoTT;
		this.MaSV = maSV;
		this.KyHoc = kyHoc;
		this.MonHoc = monHoc;
		this.DiemMonHoc1 = diemMonHoc1;
		this.DiemMonHoc2 = diemMonHoc2;
		this.DiemMonHoc3 = diemMonHoc3;
	}

	public Integer getMaSV() {
		return this.MaSV;
	}

	public void setMaSV(Integer maSV) {

		this.MaSV = maSV;
	}

	public Integer getKyHoc() {
		return this.KyHoc;
	}

	public void setKyHoc(Integer kyHoc) {
		this.KyHoc = kyHoc;
	}

	public String getMonHoc() {
		return this.MonHoc;
	}

	public void setMonHoc(String monHoc) {
		this.MonHoc = monHoc;
	}

	public double getDiemMonHoc1() {

		return this.DiemMonHoc1;
	}

	public Integer getSoTT() {
		return this.SoTT;
	}

	public void setSoTT(Integer soTT) {
		this.SoTT = soTT;
	}

	public void setDiemMonHoc1(double diemMonHoc1) {
		if (diemMonHoc1 < 0 || diemMonHoc1 > 10) {
			System.out.println("Gia tri chuyen vao ko hop le!");
		} else {
			this.DiemMonHoc1 = diemMonHoc1;
		}
	}

	public double getDiemMonHoc2() {
		return this.DiemMonHoc2;
	}

	public void setDiemMonHoc2(double diemMonHoc2) {
		if (diemMonHoc2 < 0 || diemMonHoc2 > 10) {
			System.out.println("Gia tri chuyen vao ko hop le!");
		} else {
			this.DiemMonHoc2 = diemMonHoc2;
		}
	}

	public double getDiemMonHoc3() {
		return this.DiemMonHoc3;
	}

	public void setDiemMonHoc3(double diemMonHoc3) {
		if (diemMonHoc3 < 0 || diemMonHoc3 > 10) {
			System.out.println("Gia tri chuyen vao ko hop le!");
		} else {
			this.DiemMonHoc3 = diemMonHoc3;
		}
	}

	public double DiemTB() {
//		System.out.print("Diem trung binh cua 3 mon hoc la:");
		return (this.DiemMonHoc1 + this.DiemMonHoc2 + this.DiemMonHoc3) / 3;

	}

	public void XepLoai() {
		if (DiemTB() < 5) {
			System.out.println("Xep loai D");
		} else if (DiemTB() < 6.5) {
			System.out.println("Xep loai C");
		} else if (DiemTB() < 9) {
			System.out.println("Xep loai B");
		} else {
			System.out.println("Xep loai A");
		}
	}

	@Override
	public String toString() {
		return "MaSV:" + MaSV + ", Ky hoc: " + KyHoc + ",Mon hoc " + MonHoc + ",Diem mon hoc 1: " + DiemMonHoc1
				+ ",Diem mon hoc 2:" + DiemMonHoc2 + ",Diem mon hoc 3: " + DiemMonHoc3;
	}

	public void in() {
		System.out.println("STT\tMaSV\tXep loai");
		System.out.print(SoTT + "\t" + MaSV + "\t");
		XepLoai();
		System.out.println();
	}

	public static void main(String[] args) {
		xeploai sv = new xeploai(1, 456, 1, "ly", 6, 6, 10);
		sv.setDiemMonHoc1(0);
		System.out.println("diem tb 3 mon họclà: " + sv.DiemTB());
		sv.XepLoai();
		sv.in();
	}
}
