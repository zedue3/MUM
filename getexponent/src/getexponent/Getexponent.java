/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getexponent;

/**
 *
 * @author hp
 */
public class Getexponent {

    /**
     * @param args the command line arguments
     */
    public static int getExponent(int n, int p){
        int  count=0;
        if(p<=1) return -1;
        if(n<0) n=n*-1;
        while(n!=1){
            if(n%p==0) count++;
            else break;
            n/=p;
        }
        return count;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(280, 7));
        System.out.println(getExponent(-250, 5));
        System.out.println(getExponent(18, 1));
        System.out.println(getExponent(128, 4));
        
    }
    
}
