
package hammingCode;


public class cls {
    
    
    //value of R= extra bit?
    public int extraBit(int s[]){
        int i=0;
        while(true){
            if(s.length+i+1<=Math.pow(2, i)){
                break;
            }
            i++;
        }
        return i;
    }
    
    
    //position of extra bit
    public int[] positionEB(int b[]){         
        int count=0;
        while(true){
            int p=(int)Math.pow(2, count);
            if(p>=b.length){
                break;
            }
            
            for(int i=0;i<b.length;i++){
                if(i==(p-1)){
                    b[i]=7;
                }
            }
            count++;
        }
        int[] t = new int[b.length];
        for (int i = 0,j=t.length-1; i < t.length; i++,j--) {
            t[j]=b[i];
        }
        return t;
    }
    
    //insert input bit on main Index
    public int[] insertB(int b[],int s[]){
        for (int i=0, j=0; i<b.length; i++){
            if(b[i]!=7){
                b[i]=s[j];
                j++;
            }
        }
        return b;
    }

    int[] insetrB(int[] b, int[] s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
