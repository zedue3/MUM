/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balance;

/**
 *
 * @author hp
 */
public class Balance {

    /**
     * @param args the command line arguments
     */
    public static int isBalanced (int [ ] a){
        for(int i = 0; i<a.length;i++){
            boolean foundnegativemultiple = false;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]*-1){
                    foundnegativemultiple = true;
                    break;
                }
            }
            if(!foundnegativemultiple) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBalanced(new int[] {-2, 3, 2, -3}));
        System.out.println(isBalanced(new int[] {-2, 2, 2, 2}));
        System.out.println(isBalanced(new int[] {-5, 2, -2}));
        //System.out.println(isBalanced(new int[] {-2, 3, 2, -3}));
    }
    
}
