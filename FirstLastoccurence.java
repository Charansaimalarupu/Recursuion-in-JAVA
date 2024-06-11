public class FirstLastoccurence {
    public static int first=-1;
    public static int last=-1;
    public static void accournce(int index,String str,char c){
        if (index>str.length()-1){
            return ;
        }
        if (str.charAt(index)==c && first==-1){
            first=index;
            last=index;
            

        }
        else if(str.charAt(index)==c && first!=-1){
            last=index;
            
        }
        accournce(index+1, str, c);
    }
    public static void main(String[] args) {
        accournce(0,"Charan",'a'); 
        System.out.println(first+" "+last);
        
    }
    
}
