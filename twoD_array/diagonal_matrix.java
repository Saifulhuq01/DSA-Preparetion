package twoD_array;

public class diagonal_matrix {
    public static void main(String[] args) {
        int matrix[][] = {  { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };
        
        //System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSumOptimal(matrix));
    }


    //this one is (On^2) we have optimal solution
    static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }

    //this is (On)
    static int diagonalSumOptimal(int matrix[][]) {
        int sum =0;
        for (int i = 0; i < matrix.length; i++) {
            //top right - bottom right
            sum = sum + matrix[i][i];

            //top left to bottom left
            if (i != matrix.length-1-i) {
                sum = sum + matrix[i][matrix.length-i-1];
            }
        }
        return sum;
        
    }
}
