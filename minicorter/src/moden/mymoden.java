package moden;

public class mymoden {
	private double value1;
	private double value2;
	private double ansew;

	public mymoden() {

	}

	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValue2() {
		return value2;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}

	public double getAnsew() {
		return ansew;
	}

	public void setAnsew(double ansew) {
		this.ansew = ansew;
	}

	public void cong() {
		this.ansew = this.value1 + this.value2;
	}

	public void tru() {
		this.ansew = this.value2 + this.value2;

	}

	public void nhan() {
		this.ansew = this.value1 * this.value2;
	}

	public void chia() {
		this.ansew = this.value1 / this.value2;
	}

	public void mu() {
		this.ansew = Math.pow(value1, value2);
	}

	public void chiadu() {
		this.ansew = this.value1 % this.value2;

	}

}
