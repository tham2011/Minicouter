package person;

import java.util.Scanner;

public class Persion {
	String ten;
	String gioitinh;
	String diachi;
	String ngaysinh;

	public Persion(String ten, String gioitinh, String diachi, String ngaysinh) {
		super();
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập tên: ");
		ten = sc.nextLine();
		System.out.println("Nhập giới tính:");
		gioitinh = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhập địa chỉ:");
		diachi = sc.nextLine();
		System.out.println("Nhập ngày sinh:");
		ngaysinh = sc.nextLine();

	}

	public void hienthithongtin() {
		System.out.println("tên: " + ten);
		System.out.println("ngày sinh: " + ngaysinh);
		System.out.println("địa chỉ: " + diachi);
		System.out.println("ngày sinh: " + ngaysinh);
	}

}
