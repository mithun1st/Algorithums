package algorithm;

public class selectionSort {

    public static void main(String[] args) {
        int l=7;
        int[] num={7,8,5,2,3,9,6};
        
        int p,t,c,tt;
        
        for (int i = 0; i < l-1; i++) {
            c=0;
            t=num[i];
            for (p = i; p < l; p++) {
            System.out.print("-"+num[p]);
                if(t>num[p]){
                    t=num[p];
                    c=p;
                }
            }
            System.out.println("\t"+num[i]+" / "+num[c]);
            if(num[i]<num[c] && c!=0){
                tt=num[i];
                num[i]=num[c];
                num[c]=tt;
            }
            
        }
        
        //-view
        System.out.print("Selection Sort: ");
        for(int tem : num){
            System.out.print(tem+" ");
        }
        System.out.println("");
        
        
    }

}
