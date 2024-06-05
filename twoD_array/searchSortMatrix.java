package twoD_array;


//leetcode 74
// we are using new concept staircase method
public class searchSortMatrix {
    public static void main(String[] args) {
        int matrix[][] = {  { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };

        searchInSort(matrix, 10);
        searchInSort2(matrix, 10);
    }
    // this for (0,col-1)
    static boolean searchInSort(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while (row< matrix.length && col >=0) {
            if (matrix[row][col]==key) {
                System.out.println("key found in "+row +","+col);
                return true;
            }else if (key < matrix[row][col]) {
               col--; 
            }else{
                row++;
            }
        }
        return false;
    }
    
    //this for (n-1,0)
    static boolean searchInSort2(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;
        while (row>=0 && col<=matrix[0].length) {
            if (matrix[row][col]==key) {
                System.out.println("key found in "+row +","+col);
                return true;
            }else if (key<matrix[row][col]) {
                row--;
            }else{
                col++;
            }
        }
        return false;
    }
}
