
class Fac{
    int factorial(int x){
        if(x<=1){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }
}

public class Factorial{
    public static void main(String[] args){
        Fac f = new Fac();
        System.out.println("Factorial is:"+(f.factorial(0)));
    }
}