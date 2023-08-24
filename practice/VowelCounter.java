
import java.util.Scanner;
public class VowelCounter{
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        Counter c  = new Counter();
        System.out.println(c.count(str));
    }
}

class Counter{
    
    int count(String str){
        // checking for capital letter to
        str = str.toLowerCase();
        int c = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'| str.charAt(i)=='e'|str.charAt(i)=='i'|str.charAt(i)=='o'|str.charAt(i)=='u'){
                c++;
            }
        }
        return c;
    }
}