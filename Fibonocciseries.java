import java.util.*;
public class Fibonocciseries {
    public static void fibno(int n,int a,int b,int count){
        if(count>n){
            return;
        }
        else{
            int c=a+b;
            System.out.print(" "+c);
            fibno(n,b,c,count+1);

        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(0+" "+1+" ");
        fibno(n,0,1,0);

    }
    
}
