public class SumNatuaralNos {
    public static int sum(int i,int n,int summ){
        if(i>n){
            return summ;
        }
        else{
            return sum(i+1,n,summ+i);
        }
        

    }
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int summ=0;
        int k=sum(i,n,summ);
        System.out.println(k);
    }

    
}
