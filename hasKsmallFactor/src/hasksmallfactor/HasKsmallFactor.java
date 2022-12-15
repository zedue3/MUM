/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasksmallfactor;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class HasKsmallFactor {

    /**
     * @param args the command line arguments
     */
    public static boolean hasKSmallFactors(int k, int n){
        for(int i =1; i<k;i++){
            for(int j=1;j<k;j++){
                if(i*j==n){
                    return true;
                }
            }
        }
        return false;
    }
    static int [] fill(int [] arr, int k,int n){
        int [] arr2 = new int[n];
        int j=0;
        for(int i=0;i<=k;i++){
            if(i==k) i=0;
            arr2[j] = arr[i];
            j++;
            if(j==n) break;
        }
        return arr2;
    }
    static int isHollow(int[ ] a){
        int leftzeroindex=0;
        int rightzeroindex=0;
        int countleft=0;
        int countright=0;
        int countzero=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0){
                leftzeroindex=i;
                break;
            }
            else countleft++;
        }
        for(int j=a.length-1; j>=0; j--){
            if(a[j]==0){
                rightzeroindex=j;
                break;
            }
            else countright++;
    }
        for(int k=leftzeroindex; k<=rightzeroindex;k++){
            if(a[k]!=0) return 0;
            else countzero++;
        }
        if(countzero<3 || countleft!=countright) return 0;
        return 1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isHollow(new int[] {1,2,4,9, 
0,0,0,3,4, 5}));
    }
    
}
