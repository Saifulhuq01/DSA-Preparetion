package recursion;

public class fibnocci {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    static int fib(int n){
        if (n<=1) {
            return n;
        }else{
            int last=fib(n-1);
            int seclast=fib(n-2);
            return last + seclast;
        }
    }
}
