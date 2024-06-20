public class RmvDuplicates {
    static boolean arr[]=new boolean[26];
    public static void duplicates(String str,int index,String newstr){
        if (index==str.length()){
            System.out.println(newstr);
            return;
        }
        Character curr=str.charAt(index);
        if(arr[curr-'a']==false){
            newstr=newstr+curr;
            arr[curr-'a']=true;
            duplicates(str,index+1,newstr);
        }
        else{
            duplicates(str,index+1,newstr);
        }
    }
    public static void main(String[] args) {
        String str="abbccda";
        duplicates(str,0,"");
    }
    
}
