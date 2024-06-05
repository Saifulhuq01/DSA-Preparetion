package recursion;

public class sample1 {
    public static void main(String[] args) {
        samp(1,4);
        System.out.println(samp2(5));
        incre(10);
        decre(10);
    }
    //reverse a number
    static void samp(int i,int n){
        if (n<1) {
            return;
        }else{
            samp(i+1, n-1);
            System.out.println(i);
        }
    }
    //factorial
    static int samp2(int n){
        if (n==0) {
            return 1;
        }else{
            return n*(samp2(n-1));
        }
    }
    //increment
    static void incre(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        incre(n-1);
        System.out.println(n);
    }
    //drecement
    static void decre(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decre(n-1);
    }
}
