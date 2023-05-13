/*
Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
Input format :
Line 1 : No of rows (n) and no of columns (m) (separated by single space)
Line 2 : Row 1 elements (separated by space)
Line 3 : Row 2 elements (separated by space)
Line 4 : and so on
Sample Input 1:
3 3
1 2 3
4 5 6
7 8 9
Sample Output 1 :
1 2 3
1 2 3
1 2 3
4 5 6
4 5 6
7 8 9
*/

public class solution {
	public static void print2DArray(int array[][]) {
		// Write your code here
        int len=array.length;
        for (int i=0; i<len; i++){
            for(int k=0; k<len-i; k++){
                for(int j=0; j<array[0].length; j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
        }

	}
}