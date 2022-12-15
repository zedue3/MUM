/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterarray;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Filterarray {

    /**
     * @param args the command line arguments
     */
    public static int [] filterArray(int[ ] a, int n){
        int count=0;
        int mainn=n;
        int loopcount=0;
        while(n!=0){
            int digit=n%2;
            if(digit==1) count++;
            n/=2;
            loopcount++;
        }
        if(loopcount>a.length) return null;
        int[] arr = new int[count];
        int index=0;
        for(int i=0;i<a.length;i++){
            while(mainn!=0){
                int filter=mainn%2;
                mainn/=2;
                if(filter==1){
                    if(index<count){
                        arr[index]=a[i];
                        index++;
                        i++;
                    }
                }
                else
                    break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Arrays.toString(filterArray(new int [] {9,-9}, 0)));
        System.out.println(Arrays.toString(filterArray(new int [] {9,-9}, 1)));
        System.out.println(Arrays.toString(filterArray(new int [] {9,-9}, 2)));
        System.out.println(Arrays.toString(filterArray(new int [] {9,-9}, 3)));
        System.out.println(Arrays.toString(filterArray(new int [] {9,-9}, 4)));
        System.out.println(Arrays.toString(filterArray(new int [] {9,-9,5}, 3)));
        System.out.println(Arrays.toString(filterArray(new int [] {0, 9, 12, 18, -6} , 11)));
        
    }
    
}
