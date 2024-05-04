package recursion;

//palindrome check
public class palindromeCheck {
    public static void main(String[] args) {
        String str="madam";
        System.out.println(checkIsPali(0, str));

    }
    static boolean checkIsPali(int i,String str){
        
        if (i>=str.length()/2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() -i -1)) {
            return false;
        }else{
            return checkIsPali(i+1, str);
        }
    }
}
