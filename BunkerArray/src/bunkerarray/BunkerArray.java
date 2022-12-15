/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunkerarray;

/**
 *
 * @author hp
 */
public class BunkerArray {

    /**
     * @param args the command line arguments
     */
    public static int isprime(int n){
        for(int i = 2; i<n;i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static int isBunkerArray(int [ ] a){
        for(int i = 0; i<a.length-1;i++){
            if(a[i]%2!=0 && isprime(a[i+1])==1)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBunkerArray(new int[] {4, 9, 6, 7, 3}));
        System.out.println(isBunkerArray(new int[] {4, 9, 6, 15, 21}));
    }
    
}
