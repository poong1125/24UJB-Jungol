package q616;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, e, f;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
		sc.close();

		double ALLX = a + c + e;
		double ALLY = b + d + f;

		Trinity trinity = new Trinity(ALLX, ALLY);
		double sum1 = trinity.getALLX() / 3;
		double sum2 = trinity.getALLY() / 3;

		System.out.printf("(%.1f, %.1f)", sum1, sum2);
	}
}

class Trinity {
	private double ALLX;
	private double ALLY;

	public Trinity(double ALLX, double ALLY) {
		this.ALLX = ALLX;
		this.ALLY = ALLY;
	}

	public Double getALLX() {
		return ALLX;
	}

	public void setALLX(double ALLX) {
		this.ALLX = ALLX;
	}

	public double getALLY() {
		return ALLY;
	}

	public void setALLY(double ALLY) {
		this.ALLY = ALLY;
	}

}