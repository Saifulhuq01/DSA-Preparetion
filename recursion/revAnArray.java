package recursion;


public class revAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rev(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static void rev(int[] arr,int left,int right){
        if (left>=right) {
            return;
        }else{
            swap(arr, left, right);
            rev(arr, left +1, right -1);
        }
    }
    static void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]= temp;
    }
}
