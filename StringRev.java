public class StringRev {
    public static void StrRev(int index,String str){
        if (index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        StrRev(index-1, str);
    }
    public static void main(String[] args) {
        String str="Charan";
        int index=str.length();
        StrRev(index-1, str);

    }
    
}
