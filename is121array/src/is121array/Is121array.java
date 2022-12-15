/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is121array;

/**
 *
 * @author hp
 */
public class Is121array {

    /**
     * @param args the command line arguments
     */
    public static int is121array(int[] a){
        if(a[0] !=1 || a[a.length-1] !=1) return 0;
        boolean found2=false;
        int lastofonefromleft=0;
        int lastofonefromright=0;
        int leftones=0;
        int rightone=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1)
                leftones++;
            else if(a[i]==2){
                lastofonefromleft=i;
                found2=true;
                break;
            }
        }
        for(int j=a.length-1;j>=0;j--){
            if(a[j]==1) rightone++;
            else if(a[j]==2){
                lastofonefromright=j;
                break;
            }
        }
        for(int k=lastofonefromleft;k<=lastofonefromright;k++){
            if(a[k]!=2) return 0;
        }
        if(leftones!=rightone || !found2) return 0;
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(is121array(new int[] {1,2,1}));
        System.out.println(is121array(new int[] {1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121array(new int[] {1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121array(new int[] {1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121array(new int[] {1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121array(new int[] {1, 1, 1, 1, 1, 1}));
        System.out.println(is121array(new int[] {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121array(new int[] {1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121array(new int[] {1,2,1}));
    }
    
}
