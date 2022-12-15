/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunker;

/**
 *
 * @author hp
 */
public class Bunker {

    /**
     * @param args the command line arguments
     */
    public static int isprime(int n){
        if(n==1)
            return 0;
        for(int i = 2; i<n;i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static int isBunkerArray(int [ ] a){
        boolean oneexist=false;
        boolean primeexist=false;
        for(int i = 0;i<a.length;i++){
            if(a[i]==1)
                oneexist=true;
            if(isprime(a[i])==1)
                primeexist=true;
        }
        if((oneexist==true && primeexist==false)||(oneexist==false && primeexist == true))
            return 0;
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBunkerArray(new int [] {3,7,1,8,1}));
    }
    
}
