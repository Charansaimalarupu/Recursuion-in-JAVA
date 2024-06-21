public class InviteNPeople {
    public static int invite(int n){
        if(n<=1){
            return 1;
        }
        int singleways=invite(n-1);
        int pairways=(n-1)*invite(n-2);
        return singleways+pairways;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(invite(n));
    }
    
}
