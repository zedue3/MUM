/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hp
 */
public class Bean {

    /**
     * @param args the command line arguments
     */
    public static int isBean(int [] a){
        for(int i=0;i<a.length;i++){
            boolean found=false;
            for(int j=0;j<a.length;j++){
                if(a[j]==a[i]-1 || a[j]==a[i]+1){
                    found=true;
                    break;
                }
            }
            if(!found) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBean(new int[] {2, 10, 9, 3}));
        System.out.println(isBean(new int[] {2, 2, 3, 3, 3}));
        System.out.println(isBean(new int[] {1, 1, 1, 2, 1, 1}));
        System.out.println(isBean(new int[] {3, 4, 5, 7}));
        }
    
}
