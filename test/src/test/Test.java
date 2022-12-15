/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    //@SuppressWarnings("empty-statement")
    static int[] fill(int [] arr, int k, int n){
        if(k<1 || n<1) return null;
        int [] arr2=new int[n];
        int j=0;
        for(int i=0;i<=k;i++){
            if(i==k) i=0;
            arr2[j]=arr[i];
            j++;
            if(j==n) break;
        }
        return arr2;
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Arrays.toString(fill(new int[] {4, 2, -3, 12}, 0, 5)));
    }
    
}
