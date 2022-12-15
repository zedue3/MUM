/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbeanarray;

/**
 *
 * @author hp
 */
public class Isbeanarray {

    /**
     * @param args the command line arguments
     */
    public static int isBean(int[ ] a){
        for(int i=0;i<a.length;i++){
            int mulWadd = ((2*a[i])+1);
            int multiple = 2*a[i];
            int div = a[i]/2;
            boolean found=false;
            for(int j=0;j<a.length;j++){
                if(a[j]==mulWadd || a[j]==multiple || a[j]== div){
                    found = true;
                    break;
                }
            }
            if(!found) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBean(new int [] {4, 9, 8}));
        System.out.println(isBean(new int [] {2, 2, 5, 11, 23}));
        System.out.println(isBean(new int [] {7, 7, 3, 6}));
        System.out.println(isBean(new int [] {3, 8, 4}));
        //System.out.println(isBean(new int [] {4, 9, 8}));
    }
    
}
