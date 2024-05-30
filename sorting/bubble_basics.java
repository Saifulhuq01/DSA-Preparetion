package sorting;

public class bubble_basics {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        
        bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        // optimal solution for ascending to descending
        // int[] arr= {1,2,3,4,5};
        // bubblesortopti(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
    }

    static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //optimal for ascending
    static void bubblesortopti(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]>arr[i+1]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            

        }
    }
}
