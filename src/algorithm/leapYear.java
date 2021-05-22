package algorithm;

public class leapYear {
    public static boolean lp(int i){
        boolean b=false;
        if(i%4==0 || i%100==0 || i%200==0){
            b=true;
        }
        return b;
    }
    public static void main(String[] args) {
        for (int i = 1980; i < 2030; i++) {
            if(lp(i)){
                System.out.print(i+" ");
            }
        }
    }

}
