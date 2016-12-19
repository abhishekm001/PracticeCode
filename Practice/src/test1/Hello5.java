package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> [] arr = new ArrayList[3];
		
		for(int i =0 ; i<3 ;i++){
			
			List<Integer> temp = new ArrayList<>();
			temp.add(1);
			temp.add(2);
			
			arr[i] = (ArrayList<Integer>) temp;
			
		}
		
		for(ArrayList<?> a : arr){
			
			System.out.println(a.get(0));
			System.out.println(a.get(1));
		}

		Arrays.asList(arr); 	
	}

}
