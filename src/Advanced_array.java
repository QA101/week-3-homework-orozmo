//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class Advanced_array {
	public static void main(String[] args) {
/*		
 * 
 1)Write a program which takes as input 1D- array and finds maximum number , it’s
	index value.		

		int [] input = {7,8,9,5,4};
		int maxValue = getMaxValue(input);
		System.out.println("This is the Max Value:" + maxValue);
		}

	public static int getMaxValue(int[] input) { 

		    int maxValue = 0;
		    //variable 
		    for (int i = 0; i < input.length; i++) {
		        if (input[i] > maxValue) {
		            maxValue = input[i];
		        }
		    }
		    return maxValue;
		    
------------
2)Write a program which takes as input 1D- array and finds minimum number, it’s
index value.
 		    

		int [] input = {7,8,9,5,4};
		int minValue = getMinValue(input);
		System.out.println("This is the Min Value:" + minValue);
		}

	public static int getMinValue(int[] input) { 

		    int minValue = input.length;
		    //variable 
		    for (int i = 0; i < input.length; i++) {
		        if (input[i] < minValue) {
		            minValue = input[i];
		        }
		    }
		    return minValue;
-------------
3) Write a program which takes as input 2D- array and finds maximum number , it's
index value.

		int [] firstArray = {7,8,9,5,4};
		int [] secondArray = {8,5,7,2,1};
		int [] convineArray = new int [firstArray.length + secondArray.length];
		System.arraycopy(firstArray, 0, convineArray, 0, firstArray.length);
		System.arraycopy(secondArray, 0, convineArray, firstArray.length, secondArray.length);
		int maxValue = getMaxValue(convineArray);
		System.out.println("This is the Max Value:" + maxValue);
		}

	public static int getMaxValue(int[] convineArray) { 

		    int maxValue = 0;
		    //variable 
		    for (int i = 0; i < convineArray.length; i++) {
		        if (convineArray[i] > maxValue) {
		            maxValue = convineArray[i];
		        }
		    }
		    return maxValue;
		    
---------------
4) Write a program which takes as input 2D- array and finds minimum number, it's
index value.

		
		int [] firstArray = {7,8,9,5,4};
		int [] secondArray = {8,5,7,2,1};
		int [] convineArray = new int [firstArray.length + secondArray.length];
		System.arraycopy(firstArray, 0, convineArray, 0, firstArray.length);
		System.arraycopy(secondArray, 0, convineArray, firstArray.length, secondArray.length);
		int minValue = getMinValue(convineArray);
		System.out.println("This is the Min Value:" + minValue);
		}

	public static int getMinValue(int[] convineArray) { 

		    int minValue = convineArray.length;
		    //variable 
		    for (int i = 0; i < convineArray.length; i++) {
		        if (convineArray[i] < minValue) {
		        	minValue = convineArray[i];
		        }
		    }
		    return minValue;
---------
5) Write a program which takes as input 1D- array and reverse an array.

	
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
-------
6.1 Write a program which takes as input two 1D- array and find the sum of two
array and store results in new array.
Example: input : int [] a ={1,2,3,4};
int[] b = {10,20,30,40};
output : int [] c = {11,22,33,44};

		int [] a ={1,2,3,4};
		int [] b = {10,20,30,40};
		int []c = new int [a.length];
		
		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i] + b [i];
			System.out.println(c[i]);
		}
		
		
		
		
---------
6.2 Write a program which takes as input two 1D- array and find the difference of
two array and store results in new array.
Example: input : int [] a ={1,2,3,4};
int[] b = {10,20,30,40};
output : int [] c = {-9,- 18, -27,- 36};
*/
		int [] a ={1,2,3,4};
		int[] b = {10,20,30,40};
        int []c = new int [a.length];
		 if((a.length) == (b.length))
		 {
			 for (int i = 0; i < a.length; i++)
				{
					c[i] = a[i] - b [i];
					System.out.println(c[i]);
				} 
		 }
		 else 
		 {
			 System.out.println("arrays are not the same size");
		 }

	
	}
	
	
 }
		
		
	

