package algorithm;

public class separateNumber {

    public static void main(String[] args) {
        int n=123;
        int t;
        while(n>0){
            t=n%10;
            System.out.print(" "+t);
            n/=10;
        }
    }

}
