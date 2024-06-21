import java.util.*;
public class FirstNsubset {
    ArrayList<Integer>subset=new ArrayList<>();
    public static void subsets(int n,ArrayList<Integer>subset){
        if (n==0){
            System.out.println(subset);
            return;
        }
        subset.add(n);
        subsets(n-1,subset);
        subset.remove(subset.size()-1);
        subsets(n-1,subset);


    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer>subset=new ArrayList<>();
        subsets(n,subset);
    }

    
}
