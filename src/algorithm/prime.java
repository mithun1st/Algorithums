package algorithm;

public class prime {

    public static void main(String[] args) {
        
        int n=27;
        
        int d=n/2;
        
        for (int i = 2; i < d; i++) {
            if(n%i==0){
                System.out.println("Not prime");
                System.exit(0);
            }
        }
        System.out.println("Prime");   
        System.exit(0);
    }

}
