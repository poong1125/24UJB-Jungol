package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for(int i=0; i <=1 ; i++) {
		String name = sc.next();
		int korean = sc.nextInt();
		int english = sc.nextInt();
		String name1 = sc.next();
		int korean1 = sc.nextInt();
		int english1 = sc.nextInt();
		Student student = new Student(name,korean,english,name1,korean1,english1);
	}
	sc.close();
		
		
	}

}

class Student{
	public String name;
	public int korean;
	public int english;
	public String name1;
	public int korean1;
	public int english1;
	
	
	Student(String name,int korean,int english,String name1,int korean1,int english1){
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.name1 = name1;
		this.korean1 = korean1;
		this.english1 = english1;
		
		
		System.out.println(name+ " "+ korean+ " " + english + "\n" + name1 + " " + korean1 + " " + english1);
		System.out.println("avg " + ((korean+korean1)/2) + " " + ((english+english1)/2));
		
	}
}