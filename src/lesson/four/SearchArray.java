package lesson.four;

public class SearchArray {

	public static void main(String[] args) {
		int[] a = {32,3423, 23,76,4,8};
		System.out.println(arrayInclude(a,11));
		System.out.println(arrayInclude(a,23));
		
		int[] b = {3,56,23,67,99};
		System.out.println(arrayInclude(b,3));
		

	}
	
	public static boolean arrayInclude(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==num ) {
				return true;
			}
		}
		
		return false;
	}

}
