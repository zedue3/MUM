/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbalanced;

/**
 *
 * @author hp
 */
public class IsBalanced {

    /**
     * @param args the command line arguments
     */
    public static int isBalanced(int [] a){
        if(a[0]%2!=0)
            return 0;
        for(int i=1;i<a.length;i++){
            if(i%2 ==0 && a[i]%2 != 0)
                return 0;
            if(i%2 != 0 && a[i]%2 == 0)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBalanced(new int[] {16,6,2,3}));
    }
    
}
