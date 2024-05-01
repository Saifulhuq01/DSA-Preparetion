package recursion;

public class sample1 {
    public static void main(String[] args) {
        //samp(1,4);
        System.out.println(samp2(3));
    }
    static void samp(int i,int n){
        if (n<1) {
            System.out.println("end");
        }else{
            samp(i+1, n-1);
            System.out.println(i);
        }
    }
    static int samp2(int n){
        if (n==0) {
            return 1;
        }else{
            return n*(samp2(n-1));
        }
    }
}
