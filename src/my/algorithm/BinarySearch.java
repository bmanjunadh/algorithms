package my.algorithm;

/**
 *   PreCondition -- Pass sorted int array (ascending) and item to search.
 *   Output -- return the array index , or -1 if not found.
 *   Complexity - O(log n)
 *    @author  venkata.rmb 
 * */

public class BinarySearch {

	private int[] arr=null;
	
	public BinarySearch(int[] sortedArray) {
	this.arr = sortedArray;
	
	}
	
	public int search(int item) {
		//If null sortedArray (ascending) return -1
		//else 
		//start = 0 , end = array.length - 1
		// mid = (start+end)/2
		//swap accordingly
		
		if(arr==null) {
			return -1;
		}
		
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(item==arr[mid]) {
				return mid;
			}else if(item < arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,6,7,10,45,72,183,679};
		
		BinarySearch binarySearch= new BinarySearch(arr);
		
		System.out.println(binarySearch.search(2));
		System.out.println(binarySearch.search(-2));
		System.out.println(binarySearch.search(45));
		System.out.println(binarySearch.search(183));
		System.out.println(binarySearch.search(679));
		System.out.println(binarySearch.search(7));

	}
	
}
