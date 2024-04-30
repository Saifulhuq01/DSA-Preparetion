package arrayWithSearchAlgo;

public class find_keyBS {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14};
        int key=12;
        System.out.println(find_key(arr, key));

    }
    static int find_key(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            
            int mid= (start+end)/2;
            if (arr[mid]==key) {
                return mid;
            }else if(arr[mid]<key){
                start=mid +1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    
}