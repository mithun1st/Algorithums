package algorithm;
import java.util.Scanner;

public class insertationSort {

    public static void main(String[] args) {
        int c,d,tem,l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Fixed the array limit: ");
        l=sc.nextInt();
        int[] num=new int[l];
        
        System.out.print("Input Data:");
        for (int i = 0; i < l; i++) {
            num[i]=sc.nextInt();
        }
 
        for (int i = 1; i < l; i++) {
            c=i;
            while(c>0 && num[c]<num[c-1]){
                tem=num[c];
                num[c]=num[c-1];
                num[c-1]=tem;
                c--;
            }
        }
        
        System.out.print("Insertion Sort: ");
        for(int t : num){
            System.out.print(t+" ");
        }
        System.out.println("");
        
    }

}
