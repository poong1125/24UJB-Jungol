package q618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String s[] = new String[5];
		
		for(int i = 0; i < 5; i++) {
			s[i] = bf.readLine();	
		}
		System.out.println("name");
		DaeHM dae = new DaeHM(s);
		System.out.println("weight");
		
		//객체 저장 할 뭔가 만들기
		List<DaeHDae> list = new ArrayList<DaeHDae>();
		
		for(int i = 0; i < 5; i++)
		{
			String[] values = s[i].split("\\s+"); //1개 이상의 tap , 공백을 기준으로 문자열 자르기 
//			System.out.println(values[0]);
//			System.out.println(values[1]);
//			System.out.println(values[2]);
			
			list.add(new DaeHDae(values[0],Integer.parseInt(values[1]),Float.parseFloat(values[2])));
		}
		
		//Arrays.sort(list,new WeightComparator());
		list.sort((o1,o2)-> (int)( (o2.weight * 10) - (o1.weight * 10)));
		
		for(DaeHDae a : list)
			System.out.print(a.name + " " + a.height + " " + a.weight);
			System.out.print(3);
			
	}

}


class DaeHM{
	
	public DaeHM(String[] name){
		Arrays.sort(name);
		for(String name1 : name) {
			System.out.println(name1);
		}
		System.out.println();
	}
}

class DaeHDae{
	public String name;
	public int height;
	public double weight;
	
	public DaeHDae(String name,Integer height , double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
}
class WeightComparator implements Comparator<DaeHDae> {
    @Override
    public int compare(DaeHDae a, DaeHDae b) {
        if (a.weight < b.weight) {
            return -1;
        } else if (a.weight > b.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}