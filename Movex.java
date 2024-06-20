import java.util.*;
public class Movex {
    static int count;
    public static void finish (String newstr,int count){
        for(int i=0;i<count;i++){
            newstr=newstr+'x';
        }
        System.out.println(newstr);
        return;

    }
    public static void move(String str,int index,String newstr){
        if (index==str.length()){
            System.out.println(newstr);
            finish(newstr,count);
            return;
        }
        Character ch=str.charAt(index);
        if (ch=='x'){
            count=count+1;
            move(str, index+1, newstr);
        }
        else{
            newstr=newstr+ch;
            move(str,index+1,newstr);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="axbcxxd";
        String newstr="";
        move(str,0,newstr);
        for(int i=0;i<count;i++){
            newstr= newstr +'x';
        }
        System.err.println(newstr);
    }
    
}
