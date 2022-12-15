/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullnesscoeficient;

/**
 *
 * @author hp
 */
public class Fullnesscoeficient {

    /**
     * @param args the command line arguments
     */
    public static int fullnessQuotient(int n){
        if(n<0) return -1;
        int count=0;
        for(int base=2;base<=9;base++){
            int newn=n;
            boolean flag=false;
            while(newn != 0){
                if(newn%base==0){
                    flag=true;
                    break;
                }
                newn/=base;
            }
            if(!flag) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fullnessQuotient(360));
    }
    
}
