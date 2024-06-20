import java.util.HashSet;

public class UniqueSubSequence {
    public static void subsequence(String str,int index,HashSet<String>set,String newstring){
        if (index==str.length()){
            if(set.contains(newstring)){
                return;
            }
            else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        Character curr=str.charAt(index);
        subsequence(str,index+1,set,newstring+curr);
        subsequence(str,index+1,set,newstring);

    }
    public static void main(String[] args) {
        String str="aaa";
        int index=0;
        String newstring="";
        HashSet<String>set=new HashSet<>();
        subsequence(str,index,set,newstring);

    }
    
}
