package test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hello4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<List> arrlist = new ArrayList<>();
		
		
		for(int i =0 ; i<4 ;i++){
			
			List<Integer> temp = new ArrayList<>();
			temp.add(1);
			temp.add(2);
			
			arrlist.add(temp);
			
		}
		
		
		Iterator itr = arrlist.iterator();
		
		while(itr.hasNext()){
			
			@SuppressWarnings("unchecked")
			List<Integer> temp = (List<Integer>) itr.next();
			System.out.println(temp.get(0) +""+ temp.get(1));
			for(Integer i : temp){
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		

	}

}
