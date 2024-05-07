package hashing;


/**
 * sampleHashing
 */
public class sampleHashing {

    public static void main(String[] args) {
        int[] arr={1,3,2,1,3};
        intergerHash(arr, 3);
        

        //String str="acbacacc";
        //stringHash(str, 'c');
        

    }
    static void intergerHash(int[] arr,int n){
    
        int hash[]=new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        System.out.println(hash[n]);   
    }

    static void stringHash(String str,char ch){
        int[] hash =new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)- 'a']++;
        }
        System.out.println(hash[ch - 'a']);
    }


    
}