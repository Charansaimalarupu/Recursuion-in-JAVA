public class Factorial {
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int number = 5; // number to calculate factorial
        int k=factorial(number);
        System.out.println("Factorial of "+number+" is "+k);
    }
    
}
