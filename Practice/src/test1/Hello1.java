package test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Hello1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection coll = new ArrayList<Object>();
		
//		coll.add(new Integer(1));
//		coll.add(8);
//		coll.add("aad");
//		
		coll.add(1);
		
		Iterator<?> itr = coll.iterator();
		
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		for (Object o: coll){
			System.out.println(o.toString());
		}
		
		
		
	}

}
