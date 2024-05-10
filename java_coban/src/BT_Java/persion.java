package BT_Java;

public class persion {
	String hoten;
	int namsinh;

	public void Setsv(String hoten, int namsinh) {
		this.hoten = hoten;
		this.namsinh = namsinh;
	}
}

class Sinhvien extends persion {
	public void Print() {
		System.out.println("Ho ten: " + hoten);
		System.out.println("Nam sinh: " + namsinh);
	}
}
