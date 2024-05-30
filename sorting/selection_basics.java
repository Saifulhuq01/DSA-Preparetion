package sorting;

public class selection_basics {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos=i;
            for (int j = i+1; j < arr.length ; j++) {
                //ascending
                if (arr[minPos] > arr[j]) {
                    minPos=j;
                }

                //decending
                // if (arr[minPos] < arr[j]) {
                //     minPos=j;
                // }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
}
