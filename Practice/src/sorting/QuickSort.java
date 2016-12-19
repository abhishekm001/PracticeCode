package sorting;

public class QuickSort {
	
	static int[] array = {5,2,1,8,11,3,78};
	
	private void swap(int[] array, int i, int j){
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	
	
	public void quickSort(int[] array, int lower, int higher){
		
		
		if(lower < higher){
			
			int pivotIndex = (lower + higher)/ 2 ;
			
			
			int i = lower;
			int j = higher;
			
			while(i<j){
				
				while(array[i] < array[pivotIndex] && i < pivotIndex){
					i++;
				}
				while(array[pivotIndex] < array[j] && pivotIndex < j){
					j--;
				}
				
				if(i<j){
					
					swap(array,i,j);
					
				}
				i++;
				j--;
				
			}
			
			quickSort(array,lower, pivotIndex );
			quickSort(array, pivotIndex+1,higher);
			
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i : array){
			System.out.print(i +"  ");
		}
		System.out.println();
		new QuickSort().quickSort(array, 0, array.length-1);
		
		for(int i : array){
			System.out.print(i +"  ");
		}
		
	}

}
