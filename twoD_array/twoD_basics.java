package twoD_array;

public class twoD_basics {
    public static void main(String[] args) {
        //int matrix[][] = new int[3][3];
        //matrixpattern(matrix);
        int matrix[][] ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(searching(matrix, 5));
    }
    // static void matrixpattern(int matrix[][]){
    //     Scanner sc = new Scanner(System.in);
    //     for (int i = 0; i < matrix.length; i++) {
    //        for (int j = 0; j < matrix[0].length; j++) {
    //             matrix[i][j] = sc.nextInt();
    //        } 
    //     }
    // }
    static boolean searching(int matrix[][],int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]== key) {
                    System.out.println("key found in "+ i+ "," + j);
                    return true;
                }
            } 
        }
        return false;
    }
}
