import java.util.Scanner;

class A{
    boolean checkPalindrome(String str){
        boolean isPal= true;
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
          
            if(str.charAt(i)!=str.charAt(n-1-i)){
                isPal = false;
                break;
            }
         


        }
        return isPal;
    }
}
public class Palindrome {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the strintg");
    String str = sc.nextLine();
    A a = new A();
    // (a.isPal(str))?System.out.println(" yes"):System.out.println("NO");
    System.out.println(a.checkPalindrome(str) ? "Yes" : "No");
    }
}
