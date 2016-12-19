package test1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Hello8 {

	
	public static Comparator<Integer> intCompare = new Comparator<Integer>(){

		@Override
		public int compare(Integer arg0, Integer arg1) {
			// TODO Auto-generated method stub
			
			return (arg0 - arg1)*(-1);
			
		}
		
		
	};

	public class intCompare1 implements Comparator<Integer>{

		@Override
		public int compare(Integer arg0, Integer arg1) {
			// TODO Auto-generated method stub
			
			return (arg0 - arg1)*(-1);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
