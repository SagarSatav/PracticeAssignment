package sorting;

public class Testsorting {
public static void main(String[] args) {
sorting s=new sorting();
	int arr[]={30, 9, 20, 11, 59, 15, 33};
	System.out.println("pass :"+s.bubblesort(arr));
	System.out.println(s.binarysearch(arr, 11));
	System.out.println(s.binarysearch(arr, 30));
//	s.selectionsort(arr);
//	s.insertionsort(arr);
	//System.out.println("pass :"+s.bubblesort(arr));
	
//s.quicksort(arr, 0, arr.length-1);
//	s.mergesort(arr, 0, arr.length-1);
	for(int b:arr) {
		System.out.print(b+" ");
	}
	
	   
	
}
}
