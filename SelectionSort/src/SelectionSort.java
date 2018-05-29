

public class SelectionSort{

	public static void main(String[] args) {
		
		int [] numbers = {12,15,84,24,23,20,46,47,29,37,66};
		
		selectionSort(numbers);
		System.out.println(isSorted(numbers));
		print(numbers);
	}
	
	//selection sort algorithm 
	//places the elements of the array into sorted order by the largest to the back
	
	public static void selectionSort(int[] a){
		//find index of largest element 
		for(int i= a.length-1; i>0;i--){
			int largest = i;
			for(int j=i-1; j>=0; j--){
				if(a[j] > a[largest]){
					largest = j;
				}
			}
			
			swap(a,i,largest);//swaps the Largest to the back 
			
			
		}
	}
		
		//swapa[i] with a [j]
		
		public static void swap (int[] a, int i, int j){
			if(i!=j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		//return true if array is in assorted order 
	
		public static boolean isSorted(int[]a){
			for (int i =0;i<a.length -1;i++){
				if(a[i]> a[i+1]){
					return false;
				}
			}
			return true;
		}
		
		public static void print(int[] a) {
			for(Integer i: a) {
				System.out.print(i + " ");
			}
			//System.out.println();
		}
	
	}




