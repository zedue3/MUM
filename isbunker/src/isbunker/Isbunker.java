/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbunker;

/**
 *
 * @author hp
 */
public class Isbunker {

    /**
     * @param args the command line arguments
     */
    public static int isBunker (int n){
        int sum = 1;
        for(int i=1;i<n;i++){
            sum+=i;
            if(sum==n) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBunker(22));
        System.out.println(isBunker(3));
        System.out.println(isBunker(16));
    }
    
}
