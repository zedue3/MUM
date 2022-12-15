/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package center;

/**
 *
 * @author hp
 */
public class Center {

    /**
     * @param args the command line arguments
     */
    public static int isCentered(int[ ] a){
        if(a.length%2==0) return 0;
        int center=a.length/2;
        for(int i=0;i<a.length;i++){
            if(a[i]<=a[center] && i!=center) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isCentered(new int[] {1, 2, 3, 4, 5}));
        System.out.println(isCentered(new int[] {3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[] {3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[] {3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[] {}));
        System.out.println(isCentered(new int[] {1}));
    }
    
}
