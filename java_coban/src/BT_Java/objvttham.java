package BT_Java;

public class objvttham {
	static class Sinhvien {
		String hoTen;
		int namsinh;

		public Sinhvien(String hoTen, int namsinh) {
			this.hoTen = hoTen;
			this.namsinh = namsinh;
		}

		public int getnamsinh() {
			return namsinh;
		}

		public void sethoTen(String hoTen) {
			this.hoTen = hoTen;
		}

		public String inSV() {
			return hoTen + " " + namsinh;
		}
	}

	public static void main(String[] args) {
		Sinhvien sv1 = new Sinhvien("Vu thi tham", 2004);
		Sinhvien sv2 = new Sinhvien(" tham vu thi", 2004);

		System.out.println("Thong tin sv:");
		System.out.println(sv1.inSV());
		System.out.println(sv2.inSV());

		sv1.sethoTen(" 2222");
		System.out.println(sv1.inSV());

		System.out.print("Nam sinh: " + sv1.getnamsinh());
	}
}
