package sum_and_product_array;

public class sum {
	
	
	public static int sum(int arr[]) {
		int prev=0;
		
		for(int i=0;i<arr.length;i++) {
			
			prev=prev+arr[i];
		}
		return prev;
	}
	
	public static int product(int arr[]) {
		int temp=1;
		for(int i=0;i<arr.length;i++) {
			
			temp= temp*arr[i];
		}
		
		
		return temp;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,5,7,8,9,6,3,22};
		
		int total=sum(arr);
		int prod=product(arr);
		
		
		System.out.println("Sum of elements of Array is " + total);
		

		System.out.println("product of elements of Array is " + prod);

	}

}
