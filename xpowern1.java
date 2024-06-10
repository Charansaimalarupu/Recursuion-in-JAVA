import java.util.*; 
public class xpowern1 {
    public static int powerf1(int x,int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        if (n%2==0){
            return powerf1(x,n/2)*(powerf1(x,n/2));

        }
        else{
            return powerf1(x,n/2)*powerf1(x,n/2)*x;
        }
       

    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(powerf1(2,4));
       
    }
    
}
