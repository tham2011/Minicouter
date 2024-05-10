package person;

import java.util.Scanner;

public class student extends Persion {
	int masv;
	float dtb;
	String email;

	public student(String ten, String gioitinh, String diachi, String ngaysinh, int masv, float dtb, String email) {
		super(ten, gioitinh, diachi, ngaysinh);
		this.masv = masv;
		this.dtb = dtb;
		this.email = email;
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public float getDtb() {
		return dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập mã sinh viên: ");
		masv = sc.nextInt();
		System.out.println("Nhập điểm trung bình:");
		dtb = sc.nextFloat();
		sc.nextLine();
		System.out.println("Nhập email:");
		email = sc.nextLine();
	}

	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("Mã sinh viên: " + masv);
		System.out.println("Điểm trung bình: " + dtb);
		System.out.println("Email: " + email);
	}
	 public boolean tinhdiemtb() {
	        return dtb > 8.0;
	    }

	@Override
	public String toString() {
		return "student [masv=" + masv + ", dtb=" + dtb + ", email=" + email + "]";
	}
	 
}
