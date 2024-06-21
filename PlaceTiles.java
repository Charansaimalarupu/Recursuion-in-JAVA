public class PlaceTiles {
    public static int placetiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horizantal=placetiles(n-1,m);
        int vertical=placetiles(n-m, m);
        return horizantal+vertical;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placetiles(n,m));
    }
    
}
