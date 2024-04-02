package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String qw = sc.next();
		int qwer = sc.nextInt();
		Skrrr A = new Skrrr("Jejuelementary", 6);
		Skrrr B = new Skrrr(qw, qwer);
		sc.close();
	}
}

class Skrrr {
	public String school;
	public int grade;

	 Skrrr(String school, int grade) {
		this.school = school;
		this.grade = grade;

		System.out.println(grade + " grade in " + school + " School");
	}
}

//class School {
//	public String school;
//	public int grade;
//
//	School(String school, int grade) {
//		this.school = school;
//		this.grade = grade;
//
//		System.out.println(grade + " grade in " + school + " School");
//	}
//}