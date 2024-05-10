package arrayWithSearchAlgo;

public class subArray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        //subArr(arr);
        //maxSubArr(arr);
        //prefixSubArr(arr);
        System.out.println(kadane(arr));

    }
    static void subArr(int[] arr){
        int ts=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();  
            }
            System.out.println();
        }
        System.out.println("total ts "+ts);
    }
    //brutforce
    static void maxSubArr(int[] arr){
        int max= Integer.MIN_VALUE;
        int currsum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum=0;
                for (int k = i; k <=j; k++) {
                    currsum = currsum+ arr[k];
                }
                System.out.println(currsum);
                if (max<currsum) {
                    max = currsum;
                }
            }
            
        }
        System.out.println("max subarr "+ max);
    }
    
    //prefix method
    static void prefixSubArr(int[] arr){
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        
        prefix[0]=arr[0];
        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]= prefix[i-1]+ arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(i == 0){
                    currsum=prefix[j];
                }else{
                   currsum= prefix[j]- prefix[i -1];
                } 
                
                if (max< currsum) {
                    max = currsum;
                }
            }
        }
        System.out.println("max subarr "+ max);
    }
    //kadane algo
    static int kadane(int nums[]){
        int ms=nums[0];
        int cs=0;
        
        for (int i = 0; i < nums.length; i++) {
            cs= cs+nums[i];

            if (ms<cs) {
                ms=cs;
            }
            if (cs<0) {
                cs=0;
            }
        }
        return ms;
    }
}
