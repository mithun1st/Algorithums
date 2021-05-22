package algorithm;

public class boubleSort {

    public static void main(String[] args) {
        int[] num={4,1,6,9,7,0,5,3,2,8};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < (num.length-1); j++) {
                if(num[i]<num[j]){
                    int t=num[i];
                    num[i]=num[j];
                    num[j]=t;
                }
            }
        }
        for(int t : num){
            System.out.print(t+" ");
        }
    }

}
