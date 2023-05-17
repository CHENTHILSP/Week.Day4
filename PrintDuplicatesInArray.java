package Week2.day1;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14, 13, 12, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};
		int length = arr . length;
		System.out.println("Length of array is" + length);
		System.out.println("Duplicate values are: ");
		// int count = 0;
		for (int i = 0; i < arr.length;  i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
				
			}
		}
		
		

	}

}
