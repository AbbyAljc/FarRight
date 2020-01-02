//Abigail Schafer 40094234
//Kevin Bowe 40093493
//Assignment 2 part B
package ass2352;

public class Ass2 {

	public static void main(String[] args) {
		
		int[] arr = {3, 1, 2, 4, 6, 0}; //doesn't work
		int[] arr1 = {1, 2, 3, 0}; //works
		int[] arr2 = {2, 7, 8, 9, 10, 10, 20, 12};
		int[] arr3 = {1};
		int[] arr4 = {0};
		int[] arr5 = {1, 1};
		int[] arr6 = {1, 2, 10, 11, 1, 2, 0};
		int[] arr7 = {17, 1, 1, 2, 1, 2, 0};
		int[] arr8 = {1, 25, 0};
		int[] arr9 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int[] arr10 = {25, 1, 0};
		int[] arr11 = {2, 3, 5, 6, 0};
		int[] arr12 = {1, 3, 1, 2, 1, 2, 3, 1, 0};
		int[] arr13 = {1, 1, 1, 1, 1, 1, 0};
		int[] arr14 = {11, 12, 13, 0};
		int[] arr15 = {1, 2, 3, 0};
		int[] arr16 = {3, 4, 2, 6, 7, 0};
		int[] arr17= {12, 13, 2, 1, 0};
		int[] arr18= {1, 1, 4, 2, 4, 2, 4, 0};
		int[] arr19= {1, 12, 0};
		int[] arr20= {1, 3, 4, 1, 1, 4, 0};
		int[] temp = new int[arr.length];
		int[] temp1 = new int[arr1.length];
		int[] temp2 = new int[arr2.length];
		int[] temp3 = new int[arr3.length];
		int[] temp4 = new int[arr4.length];
		int[] temp5 = new int[arr5.length];
		int[] temp6 = new int[arr6.length];
		int[] temp7 = new int[arr7.length];
		int[] temp8 = new int[arr8.length];
		int[] temp9 = new int[arr9.length];
		int[] temp10 = new int[arr10.length];
		int[] temp11 = new int[arr11.length];
		int[] temp12 = new int[arr12.length];
		int[] temp13 = new int[arr13.length];
		int[] temp14 = new int[arr14.length];
		int[] temp15 = new int[arr15.length];
		int[] temp16 = new int[arr16.length];
		int[] temp17 = new int[arr17.length];
		int[] temp18 = new int[arr18.length];
		int[] temp19 = new int[arr19.length];
		int[] temp20 = new int[arr20.length];
		int p = 0;
		int q = 2;
		
		System.out.println(farRight(arr, p, temp)); //doesn't work
		System.out.println(farRight(arr1, p, temp1)); //works
		System.out.println(farRight(arr2, p, temp2));
		System.out.println(farRight(arr3, p, temp3));
		System.out.println(farRight(arr4, p, temp4));
		System.out.println(farRight(arr5, p, temp5));
		System.out.println(farRight(arr6, p, temp6));
		System.out.println(farRight(arr7, p, temp7));
		System.out.println(farRight(arr8, p, temp8));
		System.out.println(farRight(arr9, p, temp9));
		System.out.println(farRight(arr10, q, temp10));
		System.out.println(farRight(arr11, q, temp11));
		System.out.println(farRight(arr12, q, temp12));
		System.out.println(farRight(arr13, q, temp13));
		System.out.println(farRight(arr14, q, temp14));
		System.out.println(farRight(arr15, q, temp15));
		System.out.println(farRight(arr16, q, temp16));
		System.out.println(farRight(arr17, q, temp17));
		System.out.println(farRight(arr18, q, temp18));
		System.out.println(farRight(arr19, q, temp19));
		System.out.println(farRight(arr20, 0, temp20));
		
	}
	
	public static boolean farRight(int[] arr, int p, int[] temp) {
		
		if (temp[p] == 1) return false;
		if(arr[p]==0) return true;
		
		temp[p] = 1;
		
		int p1 = p+arr[p];
		int p2 = p-arr[p];
		
		if(p1>=arr.length) {
			if(p2<0) {
				return false;
			}
			else return farRight(arr, p2, temp);
		}
		else if (p2<0) 
			return farRight(arr,p1,temp);
		else 
			return (farRight(arr,p2,temp) || farRight(arr,p1,temp));
		
	}
	
}
