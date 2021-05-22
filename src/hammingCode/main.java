
package hammingCode;


public class main {
    
    public static void print1(int s[],int b[],int m,int r){
        System.out.print("Input Value: ");
        for (int i : s) {
            System.out.print(i+" ");
        }
        System.out.println("\n\n\t\t\t\t[Encode Section]");
        System.out.println("\n m = "+m+"\t,\t"+"r = "+r);
        System.out.println("Total Bit's sent, (m+r)= "+(m+r));
        

        int t=r-1;
        System.out.println("\nPosition of 'r' is-");
        for (int i = 0; i <r; i++) {
            System.out.println("r"+i+" = 2^"+i+" = "+(int)Math.pow(2, i));
        }
        
        System.out.print("\n Set the 'r' on index: \t");
        for(int i:b){
            if(i==Integer.parseInt("7")){
                System.out.print("r"+t+" ");
                t--;
                continue;
            }
            System.out.print("X ");
        }
        System.out.println("");
    }
    
    
    public static void print2(int b[],int r){
        int t=r-1;
        System.out.print(" Set the bit on index: \t");
        for(int i:b){
            if(i==Integer.parseInt("7")){
                System.out.print("r"+t+" ");
                t--;
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    
    
//-----------------------------------------------
    public static void main(String[] args) {
        cls o=new cls();
        
        int[] s={1,0,1,1,0,0,1,1};
        
        int m=s.length;
        int r=o.extraBit(s);
        
        int[] b=new int[m+r];
        
        b=o.positionEB(b);

        
        b=o.insertB(b,s);
       
        print1(s,b,m,r);
        print2(b,r);

        
    }

}
