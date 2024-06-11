public class Towersofhanoi {
    public static void Towersofhanoi(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println(n+"disks transfered from "+source+"to"+destination);
            return;

        }
        Towersofhanoi(n-1, source, destination,helper);
        System.out.println(n+"disks transfered from "+source+"to"+destination);
        Towersofhanoi(n-1, helper,source, destination);
    }
    public static void main(String[] args) {
        int n=3;
        Towersofhanoi(n,"s","H","d");
        
        
    }
    
}
