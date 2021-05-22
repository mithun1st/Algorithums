package algorithm;


public class random {
    
    public static void ran(int min, int max){
        int r=(int) 
                (Math.random()*((max-min)+min)+1);
        System.out.println(""+r);
    }
    
    public static void main(String[] args) {
        ran(1,6);
    }

}
