/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunk;

/**
 *
 * @author hp
 */
public class Bunk {

    /**
     * @param args the command line arguments
     */
    public static int isPascal (int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            sum+=i;
            if(sum==n) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPascal(6));
        System.out.println(isPascal(7));
        System.out.println(isPascal(10));
    }
    
}
