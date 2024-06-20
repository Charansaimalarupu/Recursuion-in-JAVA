public class Permutations {
    public static void permu(String str,String permutations){
        if (str.length()==0){
            System.err.println(permutations);
            return;
        }
        for (int i=0;i<str.length();i++){
            Character curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permu(newstr,permutations+curr);
        }

    }
    public static void main(String[] args) {
        String str="abcd";
        permu(str,"");
    }
}
    

