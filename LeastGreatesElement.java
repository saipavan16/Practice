import java.util.Arrays;


public class LeastGreatesElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr ={16,17,4,3,5,2};
      int size = arr.length;
      nextGreatest(arr,size);
      System.out.println("Final array after finding the greatest" +Arrays.toString(arr));
	}
	/*Function to replace with greast value in the elements*/
	public static void nextGreatest(int [] arr, int size){
	    /*Initialize the next greatest element */
		int max_right = arr[size -1];
        /*Always next gretaest element is rightmost element*/   
		arr[size-1]= -1;
		/*Replace all other elements with next greatest*/
		/*Start with last but one element*/
	for(int i=size-2; i >=0; i--){
		int temp = arr[i];
		arr[i] = max_right;
		if(max_right < temp)
			max_right = temp;
	}
	}
}
