/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbeean;

/**
 *
 * @author hp
 */
public class Isbeean {

    /**
     * @param args the command line arguments
     */
    public static int isPrime(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0 || n==1)
                return 0;
        }
        return 1;
    }
    public static int isBean(int [] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(isPrime(a[i])==1) sum+=a[i];
        }
        if(sum==a[0]) return 1;
       return 0; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBean(new int[] {18,5,5,5,3}));
    }
    
}
