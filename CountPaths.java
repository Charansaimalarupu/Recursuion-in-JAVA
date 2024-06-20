public class CountPaths {
    public static int countpath(int n,int m,int i,int j){
        if(i==n-1 && j==m-1){
            return 1;

        }
        if(i<0 || j<0 || i>=n ||j>=m){
            return 0;
        }
        int count1=countpath(n,m,i+1,j);
        int count2=countpath(n,m,i,j+1);
        return count1+count2;

        
        
    }
    
    public static void main(String[] args) {
        int n=3,m=3;
        int k=countpath(n,m,0,0);
        System.out.println(k);
    }
    
}
