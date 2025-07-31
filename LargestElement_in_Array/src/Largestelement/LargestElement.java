package Largestelement;

public class LargestElement {
	
    public static int largest(int arr[]){
        int temp=0;
       for(int i=0;i< arr.length;i++){
          
           if (arr[i]> temp){
               temp=arr[i];
           }
       }
       return temp;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

        int arr []={12,4,5,6,7,54,465,87,4,87,98,8};
        
     
        int lar=largest(arr);
        System.out.println("largest in array :" + lar);
     
        

	}

}
